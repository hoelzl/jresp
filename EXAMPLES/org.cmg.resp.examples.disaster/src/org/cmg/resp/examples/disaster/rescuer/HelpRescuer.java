package org.cmg.resp.examples.disaster.rescuer;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.HasValue;
import org.cmg.resp.topology.Self;

public class HelpRescuer extends Agent {

	private int robotId;
	private Scenario scenario;

	public HelpRescuer(int robotId, Scenario scenario) {
		super("HelpRescuer");
		this.robotId = robotId;
		this.scenario = scenario;
	}

	@Override
	protected void doRun() throws IOException, InterruptedException {
		Tuple t = get(new Template(new ActualTemplateField("victim"),
				new FormalTemplateField(Double.class), new FormalTemplateField(
						Double.class), new FormalTemplateField(Integer.class)),
				new Group(new HasValue("role", Scenario.RESCUER)));
		
		// TODO DA FARE CON POLICY (bloccare helpRescuer quando si passa a Rescuer)
		if (scenario.getRole(robotId).equals(Scenario.RESCUER) || scenario.getRole(robotId).equals(Scenario.LOW_BATT) ) {
			//sono io RESCUER non dovevo prendere la tupla
			//la riaggiungo su di me
			double x = t.getElementAt(Double.class, 1);
			double y = t.getElementAt(Double.class, 2);
			int dimRescuerSwarm = t.getElementAt(Integer.class, 3);
			
			put(new Tuple("victim", x, y, dimRescuerSwarm), Self.SELF);

			System.out.println("Rescuer - fatta query del HelpRescuer - Riaggiunta");
		}else{
		
			double x = t.getElementAt(Double.class, 1);
			double y = t.getElementAt(Double.class, 2);
			int dimRescuerSwarm = t.getElementAt(Integer.class, 3);

			System.out.println("Robot" + robotId + "HelpRescuer receives" + x
					+ " " + y);

			// change to HELP_RESCUER node
			put(new Tuple("role", Scenario.HELP_RES), Self.SELF);

			System.out.print("Robot " + robotId + " has become HELP_RESCUER\n");
			// update the info according to the dimRescuerSwarm
			if (dimRescuerSwarm > 1) {
				int f = dimRescuerSwarm - 1;
				System.out.println("Rescuers rimanenti "+ f);
				put(new Tuple("victim", x, y, f), Self.SELF);
			}
			//go to victim positions received
			gotoVictim(x, y);
			
			boolean found = false;
			while (!found) {
				// reaching the victim and halts for helping the other rescuers
				t = query(new Template(new ActualTemplateField(
						"VICTIM_PERCEIVED"), new ActualTemplateField(true)),
						Self.SELF);
				found = t.getElementAt(Boolean.class, 1);

				if (found) {
					// TODO robot must stop by using POLICY !!!
					put(new Tuple("stop"), Self.SELF);

					// Pass to RESCUER state
					put(new Tuple("role", Scenario.RESCUER), Self.SELF);

					System.out.print("Robot " + robotId		+ " has become RESCUER\n");
					put(new Tuple("rescue",
							scenario.getPosition(robotId).getX(),
							scenario.getPosition(robotId).getY()),
							Self.SELF);
				}
			}
		}
		System.out.println("Fine HelpExplorer");
	}

	private void gotoVictim(double x, double y) throws InterruptedException,
			IOException {
		put(new Tuple("pointDirection", x, y), Self.SELF);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.cmg.resp.behaviour.Agent#doHandle(java.lang.Exception)
	 */
	@Override
	protected void doHandle(Exception e) {
	}
}
