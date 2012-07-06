/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitˆ di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.scel.examples.mobility2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.SCELValue.SCELBoolean;
import org.cmg.scel.knowledge.SCELValue.SCELType;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.ts.TupleSpace;
import org.cmg.scel.topology.AttributeCollector;
import org.cmg.scel.topology.Node;
import org.cmg.scel.topology.VirtualPort;

/**
 * @author Michele Loreti
 *
 */
public class DoubleGetMobility extends JFrame implements Observer {


	
	private SpatialConnection connection;
	private SpatialPanel panel;
	private Thread movingThread;


	public DoubleGetMobility(SpatialConnection connection) {
		super("SCEL@Work");
		this.connection = connection;
		this.connection.addObserver(this);
		this.panel = new SpatialPanel();
		setContentPane(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		movingThread = new Thread( new Runnable() {			
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					DoubleGetMobility.this.connection.move();
				}
			}
		});
	}
	
	public void start() {
		movingThread.start();
	}
	
	
	public class SpatialPanel extends JPanel {
		
		public SpatialPanel() {
			super();
			setBackground(Color.WHITE);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension((int) connection.maxX, (int) connection.maxY);
		}

		@Override
		public Dimension getSize(Dimension arg0) {
			arg0.setSize(getPreferredSize());
			return arg0;
		}

		@Override
		public void paint(Graphics arg0) {
			super.paint(arg0);
			Graphics2D g2 = (Graphics2D) arg0;
			Point2D.Double target = connection.getGreenTargetLocation();
			g2.setColor(Color.YELLOW);
			g2.fill(new Ellipse2D.Double(target.x-(connection.targetSize/2),target.y-(connection.targetSize/2),connection.targetSize,connection.targetSize));
			g2.setColor(Color.GREEN);
			g2.fill(new Ellipse2D.Double(target.x-10,target.y-10,20,20));
			target = connection.getRedTargetLocation();
			g2.setColor(Color.YELLOW);
			g2.fill(new Ellipse2D.Double(target.x-(connection.targetSize/2),target.y-(connection.targetSize/2),connection.targetSize,connection.targetSize));
			g2.setColor(Color.RED);
			g2.fill(new Ellipse2D.Double(target.x-10,target.y-10,20,20));
			for (String node : connection.getNodes()) {
				if (connection.isGreen(node)) {
					g2.setColor(Color.GREEN);
				} else {
					g2.setColor(Color.RED);
				}
				Point2D.Double p = connection.getLocation(node);
				g2.fill(new Ellipse2D.Double(p.x-5, p.y-5, 10, 10));
			}
		}
		
		
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}
	
	public static void main(String[] argv) {
		int size = 40;
		SpatialConnection sc = new SpatialConnection(size, 750);
		VirtualPort vp = new VirtualPort(10,sc);
		Hashtable<String, Node<TupleSpace>> nodes = new Hashtable<String, Node<TupleSpace>>();
		for (String name : sc.getNodes()) {
			Node<TupleSpace> n = new Node<TupleSpace>(name, new TupleSpace());
			n.addPort(vp);
			n.setGroupActionWaitingTime(250);
			n.addActuator(sc.getDirectionActuator(name));
			n.addSensor(sc.getLocationSensor(name));
			n.addSensor(sc.getTargetSensor(name));
			n.addActuator(sc.getStopActuator(name));
			n.put(new Tuple(SCELValue.getString("ISGREEN"), SCELValue.getBoolean(sc.isGreen(name))));
			n.addAttributeCollector(new AttributeCollector(
						"isgreen",
						new Template(
								new ActualTemplateField(SCELValue.getString("ISGREEN")) ,
								new FormalTemplateField(SCELType.BOOLEAN)
						)
					) {
				
				@Override
				protected Attribute doEval(Tuple t) {
					return new Attribute("color", t.getElementAt(1));
				}
			});
			Agent a = new MovementAgent("_driver_"+name,sc.getMaxX(),sc.getMaxY());
			n.addAgent(a);
			a.start();
			a = new CommunicationAgent("_comm_"+name,sc.isGreen(name));
			n.addAgent(a);
			a.start();
			nodes.put(name, n);
		}
		DoubleGetMobility sf = new DoubleGetMobility(sc);
		sf.setVisible(true);
		for (Node<?> n: nodes.values()) {
			n.start();
		}
		sf.start();
	}

}
