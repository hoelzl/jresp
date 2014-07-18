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

	public HelpRescuer(int robotId) {
		super("HelpRescuer");
		this.robotId = robotId;
	}

	@Override
	protected void doRun() throws IOException, InterruptedException {
		Tuple t = query(new Template(new ActualTemplateField("victim"),
							new FormalTemplateField(Double.class), 
							new FormalTemplateField(Double.class),
							new FormalTemplateField(Integer.class)),
						new Group(new HasValue("role",Scenario.RESCUER)));
		double x = t.getElementAt(Double.class, 2);
		double y = t.getElementAt(Double.class, 3);
		int dimRescuerSwarm = t.getElementAt(Integer.class,4);

		
		put(new Tuple("stop"), Self.SELF);
		
		//change to HELP_RESCUER node
		put(new Tuple("role",Scenario.HELP_RES),Self.SELF);
		System.out.print("Robot "+robotId+" has become HELP_RESCUER\n");
		
		//update the info according to the dimRescuerSwarm
		if (dimRescuerSwarm >1){
			put(new Tuple("victim", x,y,dimRescuerSwarm-1),Self.SELF);
		}
		
		//moving to the victim
		gotoVictim(x,y);
	}

	private void gotoVictim(double x, double y) throws InterruptedException, IOException {
		put( new Tuple( "direction" ,  x, y) , Self.SELF );
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
