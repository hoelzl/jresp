/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit� di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.res.examples.robotic;

import java.awt.BorderLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
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


	public Main( int size , double height , double width , BatteryConsumptionFunction batteryDischargingFunction ) {
		super( "Robotic scenario in jRESP");
		scenario = new Scenario(size, height, width, batteryDischargingFunction);
		init();
		setVisible(true);
		new Thread( new Runnable() {

			@Override
			public void run() {
				while( true ) {
					try {
						Thread.sleep(10);
						scenario.step(0.1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
			
		}).start();
		instantiateNet();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void instantiateNet() {
		VirtualPort vp = new VirtualPort(10);
		Hashtable<String, Node<TupleSpace>> nodes = new Hashtable<String, Node<TupleSpace>>();
		for (int i=0 ;i<scenario.getSize();i++) {
			Node<TupleSpace> n = new Node<TupleSpace>("Robot"+i, new TupleSpace());
			n.addPort(vp);
			n.setGroupActionWaitingTime(250);
			n.addActuator(scenario.getDirectionActuator(i));
			n.addSensor(scenario.getLocationSensor(i));
			n.addActuator(scenario.getStopActuator(i));
			n.addSensor(scenario.getBatterySensor(i));
			n.addSensor(scenario.getTargetSensor(i));
			n.put(new Tuple( "controlStep" , new RandomWalk() ));
			n.put(new Tuple( "lowBattery" , false ));
			n.put(new Tuple( "informed" , false));
			Agent a = new ManagedElement();
			n.addAgent(a);
			a = new TargetSeeker();
			n.addAgent(a);
			a= new BatteryMonitor();
			n.addAgent(a);
			a = new DataSeeker();
			n.addAgent(a);
			nodes.put(n.getName(), n);
		}
		for (Node<?> n: nodes.values()) {
			n.start();
		}
	}


	private void init() {
		JPanel panel = new JPanel();
		internal = new SpatialPanel(this.scenario);
		table = new JTable(new BatteryLevelData(scenario));
		panel.setLayout(new BorderLayout());
		panel.add(internal, BorderLayout.CENTER);
		panel.add(new JScrollPane(table) , BorderLayout.EAST );
		setContentPane(panel);
		pack();
	}
	
	


	public static void main( String[] argv ) throws InterruptedException {
		int size = inputSize();
		double width = inputHeightWidth("Arena width", 500);
		double height = inputHeightWidth("Arena height", 500);
		Thread.sleep(30000);
		System.out.println("!!!");
		new Main( size , height , width , new LinearConsumptionFunction(0.0001) );
	}
	
	public static int inputSize() {
		while (true) {
			String size = JOptionPane.showInputDialog("Number of robots",25);
			try {
				return Integer.parseInt(size);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, size+" is not an integer!", "Error...", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static double inputHeightWidth( String message , double value ) {
		while (true) {
			String size = JOptionPane.showInputDialog(message,value);
			try {
				return Double.parseDouble(size);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, size+" is not a double!", "Error...", JOptionPane.ERROR_MESSAGE);
			}
		}		
	}


//	@Override
//	public void update(Observable arg0, Object arg1) {
//		internal.repaint();
//		table.repaint();
//	}


}