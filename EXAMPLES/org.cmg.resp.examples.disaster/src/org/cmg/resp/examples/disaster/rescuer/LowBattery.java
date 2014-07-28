/**
 * 
 */
package org.cmg.resp.examples.disaster.rescuer;

import java.util.Random;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

/**
 * @author Andrea Margheri
 *
 */
public class LowBattery extends Agent {

	private int robotId;
	private Scenario scenario;
	
	Random r = new Random();
	
	public LowBattery(int robotId, Scenario scenario) {
		super("LowBattery");
		this.robotId = robotId;
		this.scenario = scenario;
	}

	@Override
	protected void doRun() throws Exception {
		while (true){

			Tuple t = query(new Template(
					new ActualTemplateField("WALKING"), 
					new ActualTemplateField(true)), Self.SELF);
			
			//System.out.println("ROBOT "+ this.robotId + " " + t.getElementAt(Boolean.class, 1).toString());
			
			//The condition on the battery is evaluated only when we are not in the RESCUER or HELP_RESCUER
			if (!scenario.getRole(robotId).equals(Scenario.RESCUER) ||
					!scenario.getRole(robotId).equals(Scenario.HELP_RES) && t.getElementAt(1).equals(true)) {
				
				//System.out.println("ROBOT "+ this.robotId + " " + t.getElementAt(Boolean.class, 1).toString());
				
				//check the condition on batteryLevel
				if (scenario.getBatteryLevel(this.robotId) < 30 ){
					
					System.out.println("ROBOT "+ this.robotId + " battery level "+ scenario.getBatteryLevel(this.robotId));
					
					scenario.setUnderRecharging(this.robotId);
					
					put(new Tuple("stop"), Self.SELF);
					
					//Pass to RESCUER state
					put(new Tuple("role",Scenario.LOW_BATT),Self.SELF);

					System.out.print("Robot "+robotId+" has become LOW BATTERY\n");
					
					
					//wait for recharged battery
					t = query(new Template(
								new ActualTemplateField("CHARGED"), new ActualTemplateField(true)), 
							Self.SELF);

					//battery recharged

					//move to the EXPLORER state
					put(new Tuple("role",Scenario.EXPLORER),Self.SELF);
//					//re-start moving
//					double dir = r.nextDouble() * 2 * Math.PI;
//					put(new Tuple("direction", dir), Self.SELF);


				}
			}
		}
	}

	
	
}
