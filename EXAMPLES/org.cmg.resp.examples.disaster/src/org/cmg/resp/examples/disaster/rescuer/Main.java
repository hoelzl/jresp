/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit? di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.examples.disaster.rescuer;

import java.awt.BorderLayout;
import java.util.Hashtable;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.AttributeCollector;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.simulation.DeterministicDelayFactory;
import org.cmg.resp.simulation.RandomSelector;
import org.cmg.resp.simulation.SimulationAction;
import org.cmg.resp.simulation.SimulationEnvironment;
import org.cmg.resp.simulation.SimulationNode;
import org.cmg.resp.simulation.SimulationScheduler;
import org.cmg.resp.topology.VirtualPort;

/**
 * @author Michele Loreti
 * 
 */
public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Scenario scenario;
	private JPanel internal;
	private JTable table;

	private static final double HEIGHT = 300;
	private static final double WIDTH = 250;

//	private static final int LANDMARK = 0;
//	private static final int WORKER = 1;

	public Main(int robots, int sizeOfRescuers, double height, double width) {
		super("Disaster scenario in jRESP");
		scenario = new Scenario(robots, sizeOfRescuers, 1, height, width);
		scenario.init();
		init();
		setVisible(true);
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(10);
						scenario.step(0.1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}).start();
		instantiateNet();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void instantiateNet() {
//		VirtualPort vp = new VirtualPort(10, scenario.getNodeConnection());
//		// VirtualPort vp = new VirtualPort(10, new ConnectionWithRange());
//		Hashtable<String, Node> nodes = new Hashtable<String, Node>();

		Random r = new Random();
		SimulationScheduler sim = new SimulationScheduler();
		SimulationEnvironment env = new SimulationEnvironment(sim, new RandomSelector(r), new DeterministicDelayFactory(1.0),scenario.getNodeConnection());
		
		Hashtable<String, SimulationNode> nodes = new Hashtable<String, SimulationNode>();
		sim.schedulePeriodicAction(new SimulationAction() {
			
			@Override
			public void doAction(double time) {
				scenario.step(0.1);
			}
			
		}, 0.1, 0.1);
		
		for (int i = 0; i < scenario.getRobots(); i++) {
//			Node n = new Node("" + i, new TupleSpace());
			SimulationNode n = new SimulationNode(""+i, env);
			//n.addPort(vp);
			//n.setGroupActionWaitingTime(250);
			n.addActuator(scenario.getDirectionActuator(i));
			n.addSensor(scenario.getCollisionSensor(i));
			n.addActuator(scenario.getStopActuator(i));
			n.addSensor(scenario.getVictimSensor(i));

			n.put(new Tuple("role", Scenario.EXPLORER));

			n.addAttributeCollector(new AttributeCollector("role",
					new Template(new ActualTemplateField("role"),
							new FormalTemplateField(Integer.class))) {

				@Override
				protected Object doEval(Tuple... t) {
					return t[0].getElementAt(Integer.class, 1);
				}
			});

			Agent a = new RandomWalk();
			n.addAgent(a);
			a = new Explorer(i,scenario);
			n.addAgent(a);
			a = new HelpRescuer(i);
			n.addAgent(a);
			nodes.put(n.getName(), n);
		}

//		for (int i = scenario.getLandmarks(); i < (scenario.getLandmarks() + scenario
//				.getWorkers()); i++) {
//			Node n = new Node("" + i, new TupleSpace());
//			n.setGroupActionWaitingTime(100);
//			n.addPort(vp);
//			n.addActuator(scenario.getDirectionActuator(i));
//			n.addSensor(scenario.getCollisionSensor(i));
//			n.addActuator(scenario.getStopActuator(i));
//			n.addSensor(scenario.getVictimSensor(i));
//
//			n.put(new Tuple("role", ROBOT));
//
//			n.addAttributeCollector(new AttributeCollector("role",
//					new Template(new ActualTemplateField("role"),
//							new FormalTemplateField(Integer.class))) {
//
//				@Override
//				protected Object doEval(Tuple... t) {
//					return t[0].getElementAt(Integer.class, 1);
//				}
//			});
//
//			// Agent a = new GoToVictim(i,scenario);
//			// n.addAgent(a);
//			// nodes.put(n.getName(), n);
//			// a = new VictimSeeker(i);
//			// n.addAgent(a);
//		}

//		for (Node n : nodes.values()) {
//			n.start();
//		}
		
		env.simulate(5000);
	}

	private void init() {
		JPanel panel = new JPanel();
		internal = new SpatialPanel(this.scenario);
		panel.setLayout(new BorderLayout());
		panel.add(new JScrollPane(internal), BorderLayout.CENTER);
		setContentPane(panel);
		pack();
	}

	public static void main(String[] argv) {
		int numRobots = inputRobots("Number of ROBOT robots", 20);
		int sizeOfRescuers = inputRobots("Size of RESCUERs group", 4);
		// double width = inputHeightWidth("Arena width", 500);
		// double height = inputHeightWidth("Arena height", 500);
		new Main(numRobots, sizeOfRescuers, HEIGHT, WIDTH);
	}

	public static int inputRobots(String message, int value) {
		while (true) {
			String size = JOptionPane.showInputDialog(message, value);
			try {
				return Integer.parseInt(size);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, size
						+ " is not an integer!", "Error...",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static double inputHeightWidth(String message, double value) {
		while (true) {
			String size = JOptionPane.showInputDialog(message, value);
			try {
				return Double.parseDouble(size);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, size + " is not a double!",
						"Error...", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
