/**
 * 
 */
package org.cmg.resp.examples.traffic;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.examples.traffic.data.Direction;
import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.examples.traffic.data.Trip;
import org.cmg.resp.examples.traffic.resp.AverageSpeedUpdater;
import org.cmg.resp.examples.traffic.resp.CarSpeedAgent;
import org.cmg.resp.examples.traffic.resp.CarTripAgent;
import org.cmg.resp.examples.traffic.resp.TrackAgent;
import org.cmg.resp.examples.traffic.resp.TrafficConstants;
import org.cmg.resp.examples.traffic.simulation.VirtualPositionSensor;
import org.cmg.resp.examples.traffic.simulation.VirtualSpeedSensor;
import org.cmg.resp.examples.traffic.simulation.VirtualStateSensor;
import org.cmg.resp.examples.traffic.simulation.VirtualTrackSensor;
import org.cmg.resp.examples.traffic.simulation.CarSimulation;
import org.cmg.resp.examples.traffic.simulation.Graph;
import org.cmg.resp.examples.traffic.simulation.TrackSimulation;
import org.cmg.resp.examples.traffic.simulation.Traffic;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.VirtualPort;


@SuppressWarnings("serial")         
public class Main extends JPanel {

    private static int TRACK_CAPACITY = 4;
	private static int TRACK_NUMBER = 16;
    private static int CAR_NUMBER = 1;
    private static LinkedList<Node<TupleSpace>> nodes;
    
    public Main(Traffic traffic) {
    	super(new GridLayout(1,0));
        final JTable table = new JTable(traffic);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    private static void createAndShowGUI(Traffic traffic) {
        JFrame frame = new JFrame("CarTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main newContentPane = new Main(traffic);
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {        
        // Setting up cars
        Random rand = new Random();
        Track myTrack;
        LinkedList<TrackSimulation> tracks = new LinkedList<TrackSimulation>();
        TrackSimulation[] trackArray = null;
        LinkedList<Node<TupleSpace>> trackNodes = new LinkedList<Node<TupleSpace>>();
		LinkedList<CarSimulation> cars = new LinkedList<CarSimulation>();
		VirtualPort port = new VirtualPort(10);
		nodes = new LinkedList<Node<TupleSpace>>();
		Traffic traffic;
		CarSimulation car;
		Node<TupleSpace> node;
		double speed = 0;
		for(int i=0;i<TRACK_NUMBER;i++){
			speed =  (8 + rand.nextInt(6))* 10;
			node = new Node<TupleSpace>("Track" + i, new TupleSpace());
			node.addPort(port);
			Agent a = new TrackAgent("Track"+i);
			node.addAgent(a);
			a.start();
			a = new AverageSpeedUpdater("Track"+i);
			node.addAgent(a);
			a.start();
			trackNodes.add(node);
			myTrack = new Track("Track" + i, new PointToPoint(node.getName(), port.getAddress()), i, speed , TRACK_CAPACITY);
			tracks.add(new TrackSimulation(myTrack));
			node.start();
		}
		trackArray = new TrackSimulation[tracks.size()];
		tracks.toArray(trackArray);
		traffic = new Traffic(TrafficConstants.TRACK_LENGTH, trackArray);
		Graph g = new Graph(tracks, CAR_NUMBER);
		for(int i=0;i<CAR_NUMBER;i++){
			speed =  (8 + rand.nextDouble()*5)* 10;
			car = new CarSimulation(traffic, g.selectRandomTrip("Car" + i), i, speed, Direction.NORTH);
			cars.add(car);
		}
		traffic.setAgents(cars);
		for(int i=0;i<CAR_NUMBER;i++){
			node = new Node<TupleSpace>("Car"+i,new TupleSpace()); 
			node.addSensor(new VirtualTrackSensor(traffic, i));
			node.addSensor(new VirtualPositionSensor(traffic, i));
			node.addSensor(new VirtualSpeedSensor(traffic,i));
			node.addSensor(new VirtualStateSensor(traffic, i));
			node.addPort(port);
			node.put( new Tuple( TrafficConstants.TRIP_TAG , cars.get(i).getTrip().clone() ) );
			Agent a = new CarSpeedAgent("Car"+i);
			node.addAgent(a);
			a.start();
			if (i==0) {
				a = new CarTripAgent("Car"+i );
				node.addAgent(a);
				a.start();
			}
			nodes.add(node);
		}
		createAndShowGUI(traffic);
		for (Node<TupleSpace> n : nodes) {
			n.start();
		}
		traffic.startSimulation();
	}      
}

