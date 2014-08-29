/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit? di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.cmg.resp.example.disaster.simulation;

import java.awt.BorderLayout;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.AttributeCollector;
import org.cmg.resp.examples.disaster.rescuer.policy.Explorer;
import org.cmg.resp.examples.disaster.rescuer.policy.HelpRescuer;
import org.cmg.resp.examples.disaster.rescuer.policy.IsMoving;
import org.cmg.resp.examples.disaster.rescuer.policy.RandomWalk;
import org.cmg.resp.examples.disaster.rescuer.policy.Scenario;
import org.cmg.resp.examples.disaster.rescuer.policy.SpatialPanel;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.automaton.PolicyAutomaton;
import org.cmg.resp.policy.facpl.FacplPolicyState;
import org.cmg.resp.policy.facpl.algorithm.PermitUnlessDeny;
import org.cmg.resp.simulation.DeterministicDelayFactory;
import org.cmg.resp.simulation.RandomSelector;
import org.cmg.resp.simulation.SimulationAction;
import org.cmg.resp.simulation.SimulationEnvironment;
import org.cmg.resp.simulation.SimulationNode;
import org.cmg.resp.simulation.SimulationScheduler;

/**
 * 
 * @author Andrea Margheri
 *
 */
public class MainRescuer_Policy_Simulation extends JFrame {

	private static final long serialVersionUID = 1L;
	private Scenario scenario;
	private JPanel internal;
	
	private static final double HEIGHT = 300;
	private static final double WIDTH = 250;
	

	public MainRescuer_Policy_Simulation( int robots , int numSwarmRescuer , double height , double width  ) {
		super( "Disaster scenario in jRESP by using FACPL policies");
		//1 = number of victim
		scenario = new Scenario(robots , numSwarmRescuer , 2 , height, width);
		scenario.init();
		init();
		setLocation(550, 100);
		setVisible(true);
		instantiateNet();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void instantiateNet() {
		Random r = new Random();
		SimulationScheduler sim = new SimulationScheduler();
		SimulationEnvironment env = new SimulationEnvironment(sim,
				new RandomSelector(r), new DeterministicDelayFactory(1.0),
				scenario.getNodeConnection());

		Hashtable<String, SimulationNode> nodes = new Hashtable<String, SimulationNode>();
		sim.schedulePeriodicAction(new SimulationAction() {

			@Override
			public void doAction(double time) {
				scenario.step(0.4);
			}

		}, 0.1, 0.1);

		for (int i = 0; i < scenario.getRobots(); i++) {
			final SimulationNode n = new SimulationNode("" + i, env);

			final int robotIndex = i;

			/**
			 * Actuators
			 */
			n.addActuator(scenario.getChangeRoleActuator(i));
			n.addActuator(scenario.getUpdateVictimStateActuator(i));
			n.addActuator(scenario.getDirectionActuator(i));
			n.addActuator(scenario.getPointDirectionActuator(i));
			n.addActuator(scenario.getStopActuator(i));
			n.addActuator(scenario.getStopBatteryActuator(i));
			/**
			 * Sensors
			 */
			n.addSensor(scenario.getCollisionSensor(i));
			n.addSensor(scenario.getVictimSensor(i));			
			n.addSensor(scenario.getWalkingSensor(i));
			n.addSensor(scenario.getDirectionSensor(i));
			
			//starting robot role
			n.put(new Tuple("role" , Scenario.EXPLORER));

			/**
			 * AttributeCollector = exposing the attribute of component in the interface
			 */
			n.addAttributeCollector(new AttributeCollector("role"
					// ,
					// new Template( new ActualTemplateField("role"),
					// new FormalTemplateField(String.class))
					) {
						@Override
						protected Object doEval(Tuple... t) {
							return scenario.getRole(robotIndex);
						}
					});
					
			n.addAttributeCollector( new AttributeCollector("victim_perceived", 
					new Template( new ActualTemplateField("VICTIM_PERCEIVED") , new FormalTemplateField(Boolean.class) )
			) {
				
				@Override
				protected Object doEval(Tuple ... t) {
					return t[0].getElementAt(Boolean.class, 1);
				}
			});
			n.addAttributeCollector( new AttributeCollector("walking_attribute", 
					new Template( new ActualTemplateField("WALKING") , new FormalTemplateField(Boolean.class) )
			) {
				
				@Override
				protected Object doEval(Tuple ... t) {
					return t[0].getElementAt(Boolean.class, 1);
				}
			});

			n.addAttributeCollector( new AttributeCollector("direction_attribute", 
					new Template( new ActualTemplateField("DIRECTION") , new FormalTemplateField(Double.class) )
			) {
				
				@Override
				protected Object doEval(Tuple ... t) {
					return t[0].getElementAt(Double.class, 1);
				}
			});


			n.addAttributeCollector( new AttributeCollector("collision_attribute", 
					new Template( new ActualTemplateField("COLLISION") , new FormalTemplateField(Boolean.class) )
			) {
				
				@Override
				protected Object doEval(Tuple ... t) {
					return t[0].getElementAt(Boolean.class, 1);
				}
			});


			n.addObserver(new Observer() {
				
				@Override
				public void update(Observable o, Object arg) {
					
//					System.out.println(n.getName() + "->" + 
//							n.getAttribute("victim_perceived") +
//							n.getAttribute("walking_attribute") +
//							n.getAttribute("collision_attribute") +
//							n.getAttribute("direction_attribute")
//					);
					
				}
			});			
						
			Agent a = new RandomWalk(i);
			n.addAgent(a);
			
			//Agent that checks walking status. Used for battery level. 
			//Contains also policy of LowBattery State
			IsMoving lowBattery = new IsMoving(i);
			n.addAgent(lowBattery);
			
			//Explorer needs the scenario class in order to get the victim position when found 
			Explorer e = new Explorer(i,scenario);
			n.addAgent(e);
			
			HelpRescuer h = new HelpRescuer(i,scenario);
			n.addAgent(h);
			
			
			/*
			
			//add the PolicyAutomaton with four states [from 0 to 1]
			n.setPolicy(new PolicyAutomaton(
					new FacplPolicyState(n,PermitUnlessDeny.class, e.getPolicyExplorer()),
					new FacplPolicyState(n,PermitUnlessDeny.class, e.getPolicyRescuer()),
					new FacplPolicyState(n,PermitUnlessDeny.class, h.getPolicyHelpRescuer()),
					new FacplPolicyState(n,PermitUnlessDeny.class, lowBattery.getPolicyLowBattery())
					)
			);
			
			//add Automaton Transitions
			
			//########
			
			//TODO per adesso non considerate
			 
			//########
			
			
			*/
			
			
			nodes.put(n.getName(), n);
		}
	
		env.simulate(50000);
	}


	private void init() {
		JPanel panel = new JPanel();
		internal = new SpatialPanel(this.scenario);
		panel.setLayout(new BorderLayout());
		panel.add(new JScrollPane(internal), BorderLayout.CENTER);		
		setContentPane(panel);
		pack();
	}
	
	
	public static void main( String[] argv ) {
		int numRobots = inputRobots("Number of robots", 20);
		int numRescuerSwarmSize = inputRobots("Size of RESCUER swarm", 4);
		//double width = inputHeightWidth("Arena width", 500);
		//double height = inputHeightWidth("Arena height", 500);
		new MainRescuer_Policy_Simulation( numRobots , numRescuerSwarmSize , HEIGHT , WIDTH );
	}
	
	
	public static int inputRobots(String message , int value) {
		while (true) {
			String size = JOptionPane.showInputDialog(message,value);
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


}
