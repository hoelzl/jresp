/**
 * 
 */
package org.cmg.resp.examples.cloud;

import java.util.Hashtable;
import java.util.Random;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.simulation.DeterministicDelayFactory;
import org.cmg.resp.simulation.RandomSelector;
import org.cmg.resp.simulation.SimulationAction;
import org.cmg.resp.simulation.SimulationEnvironment;
import org.cmg.resp.simulation.SimulationNode;
import org.cmg.resp.simulation.SimulationScheduler;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.Target;
import org.cmg.resp.topology.VirtualPort;

/**
 * @author Giorgio
 *
 */
public class Main {
	private Scenario scenario;
	private Random r = new Random();
	private Target id;
	
	public Main(int size){
		scenario=new Scenario(size, r , 0, 1000, 0, 100);
		instantiateNet();
	}
	
	private void instantiateNet() {
		Random r = new Random();
		SimulationScheduler sim = new SimulationScheduler();
		SimulationEnvironment env = new SimulationEnvironment(sim, new RandomSelector(r), new DeterministicDelayFactory(1.0) );
		sim.schedulePeriodicAction(new SimulationAction() {
			
			@Override
			public void doAction(double time) {
				System.out.println("TIME "+time+": "+scenario.getInfo());
			}
			
		}, 0.0 , 1000.0);
		Hashtable<String, SimulationNode> nodes = new Hashtable<String, SimulationNode>();
		for(int i=0; i<scenario.getSize(); i++){
			SimulationNode n = new SimulationNode("Nodo"+i, env );
			n.addSensor(scenario.getCpuSensor(i));
			n.addSensor(scenario.getMemorySensor(i));
			n.addActuator(scenario.getServiceInvocationActuator(i, n));
			n.addAttributeCollector(scenario.getCpuLoadAttributeCollector());
			n.addAttributeCollector(scenario.getCpuRateAttributeCollector(i));
			n.addAttributeCollector(scenario.getMemoryAttributeCollector());
			n.put(new Tuple("REQUEST", 1, new CloudService("1", 10, 2.0), n.getLocalAddress() ));
		    Agent a= new RequestHandler(); 
			n.addAgent(a);
			a=new OfferAgent();
			n.addAgent(a);
			nodes.put(n.getName(), n);
		}
		env.simulate(5000);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size=3;
		//CloudService a= new CloudService("1", 10, 2.0);
		//CloudService b= new CloudService("2", 30, 10.0);
		//CloudService c= new CloudService("3", 50, 25.0);
		//CloudService d= new CloudService("4", 250, 30.0);
		//CloudService e= new CloudService("5", 500, 50.0);
		new Main(size);

	}

}
