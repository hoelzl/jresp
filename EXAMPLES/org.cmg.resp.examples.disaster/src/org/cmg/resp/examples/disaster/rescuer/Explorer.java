package org.cmg.resp.examples.disaster.rescuer;

import java.io.IOException;
import java.util.concurrent.locks.Lock;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.examples.disaster.rescuer.Scenario;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

public class Explorer extends Agent {

	private int robotId;
	private Scenario scenario;

	private Lock lock;
	
	public Explorer(int robotId, Scenario scenario) {
		super("Explorer");
		this.robotId = robotId;
		this.scenario = scenario;
	}

	@Override
	protected void doRun() throws IOException, InterruptedException {
		boolean found = false;
		while (!found) {
			// Thread.sleep(2000);
			Tuple t = query(new Template(new ActualTemplateField(
					"VICTIM_PERCEIVED"), new ActualTemplateField(true)), Self.SELF);
			found = t.getElementAt(Boolean.class, 1);
			if (found) {
				// TODO robot must stop by using POLICY !!!
				put(new Tuple("stop"), Self.SELF);
				//Pass to RESCUER state
				put(new Tuple("role",Scenario.RESCUER),Self.SELF);
				
				//TODO CAMBIARE
				get(new Template(new ActualTemplateField("roleAttr"),
							new ActualTemplateField(Scenario.EXPLORER)),
							Self.SELF);
				put(new Tuple("roleAttr",Scenario.RESCUER),Self.SELF);
							
				System.out.print("Robot "+robotId+" has become RESCUER\n");
					
				found();
				put(new Tuple("rescue"), Self.SELF);
			}
		}
		System.out.println("Fine Explorer");	
	}

	private void found() throws InterruptedException, IOException {
		put(new Tuple("victim", 
				scenario.getPosition(robotId).getX(), 
				scenario.getPosition(robotId).getY(),
				scenario.getRescuersSwarmSize()),
			Self.SELF);
		
		// put( new Tuple( "victim" , robotId , 0 ) , Self.SELF );
	}

}
