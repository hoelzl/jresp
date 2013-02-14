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
package org.cmg.res.examples.robotic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.cmg.res.examples.robotic.Scenario.RobotState;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.AttributeCollector;
import org.cmg.resp.core.simulation.DeterministicDelayFactory;
import org.cmg.resp.core.simulation.ExponentialDelayFactory;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.core.simulation.Simulation;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.VirtualPort;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;

/**
 * @author loreti
 *
 */
public class RobotSimulation extends Simulation {
	
	protected Scenario scenario;
	protected PrintWriter out;
	private double success;
	
	public RobotSimulation(Scenario scenario, double success) throws FileNotFoundException {
		this.scenario = scenario;
		this.success = success;
		this.out = new PrintWriter("/tmp/output.txt");
	}

	@Override
	protected boolean checkFailureCondition() {
		//No failure condition is set.
		return false;
	}

	@Override
	protected boolean checkSuccessCondition() {
		return scenario.getRobotOnTarget()>=success;
	}

	@Override
	protected void update(double dt) {
		scenario.step(dt);
	}

	@Override
	protected void init(ProcessSimulator sim) {
		scenario.init();
		VirtualPort vp = new VirtualPort(10);
//		Hashtable<String, Node<TupleSpace>> nodes = new Hashtable<String, Node<TupleSpace>>();
		for (int i=0 ;i<scenario.getSize();i++) {
			SimNode n = new SimNode("Robot"+i, new SimTupleSpace(sim),sim , new ExponentialDelayFactory(20));
			n.addPort(vp);
			n.setGroupActionWaitingTime(250);
			n.addActuator(scenario.getDirectionActuator(i));
			n.addSensor(scenario.getLocationSensor(i));
			n.addActuator(scenario.getStopActuator(i));
			n.addSensor(scenario.getBatterySensor(i));
			n.addSensor(scenario.getTargetSensor(i));
			n.addActuator(scenario.getRobotStateActuator(i));
			n.addActuator(scenario.getPerceivedTargetActuator(i));
			n.put(new Tuple( "controlStep" , true , new RandomWalk() ));
			n.put(new Tuple( "lowBattery" , false ));
			n.put(new Tuple( "informed" , false));
			n.put(new Tuple( "task" , i%2) );
			n.addAttributeCollector( new AttributeCollector("task", 
					new Template( new ActualTemplateField( "task"),
								new FormalTemplateField(Integer.class)
							)
			) {
				
				@Override
				protected Attribute doEval(Tuple t) {
					return new Attribute("task", t.getElementAt(Integer.class, 1));
				}
			});
			Agent a = new ManagedElement();
			n.addAgent(a);
			a = new TargetSeeker();
			n.addAgent(a);
			a= new BatteryMonitor();
			n.addAgent(a);
			a = new DataSeeker(i%2);
			n.addAgent(a);
//			nodes.put(n.getName(), n);
		}

	}

	public static int total_iterations;
	public static int performed_iterations;
	public static int successes;
	
	public static void main(String[] argv) throws NumberFormatException, IOException {
		int size = Integer.parseInt(argv[0]);
		double height = Double.parseDouble(argv[1]);
		double width = Double.parseDouble(argv[2]);
		double deadline = Double.parseDouble(argv[3]);
		double success = Double.parseDouble(argv[4]);
		double batterDischargingFactor = Double.parseDouble(argv[5]);
		String resultFile = argv[6];
		loadData( resultFile );
		long start = System.currentTimeMillis();
		Scenario scenario = new Scenario(size, width, height, new LinearConsumptionFunction(batterDischargingFactor));
		RobotSimulation simulation = new RobotSimulation(scenario,success);
		performed_iterations++;
		if (simulation.run(deadline, 0.1)) {
			successes++;
			System.out.println("OK!!!");
		} else {
			System.out.println("KO!!!");			
		}
		System.out.println("\nTime: "+(System.currentTimeMillis()-start)+"\n\n\n");
		outputData(resultFile);
	}
	
	

	private static void outputData(String resultFile) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(resultFile);
		writer.println(performed_iterations);
		writer.println(successes);		
		writer.flush();
		writer.close();
	}

	private static void loadData(String resultFile) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(resultFile));
		performed_iterations = Integer.parseInt(reader.readLine());
		successes = Integer.parseInt(reader.readLine());
		reader.close();
	}

	@Override
	protected void schedultEvents(ProcessSimulator sim) {
		new Event( sim ) {

			@Override
			public void actions() {
//				System.out.println("TIME: "+sim.time());
//				System.out.println("TARGET: "+scenario.getTarget());
//				for( int i=0 ;i<scenario.getSize() ;i++) {
//					if (!scenario.getState(i).equals(RobotState.REACHED.name())) {
//						System.out.println("Robot "+i+" target: "+scenario.getInformedTarget(i)+"position: "+scenario.getPosition(i)+" direction: "+scenario.getDirection(i)+" distance: "+scenario.getDistaneToTarget(i)+" state: "+scenario.getState(i));
//					}
//				}
				System.out.print(".");
				System.out.flush();
				schedule(10.0);
			}
			
		}.schedule(0.0);
	}

	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

}
