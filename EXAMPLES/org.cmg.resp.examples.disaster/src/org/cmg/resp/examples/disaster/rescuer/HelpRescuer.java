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
						new FormalTemplateField(Double.class)), 
						new Group(new HasValue("role",Scenario.RESCUER)));
		double x = t.getElementAt(Double.class, 2);
		double y = t.getElementAt(Double.class, 3);

		put(new Tuple("stop"), Self.SELF);
		// put( new Tuple( "stop" , Scenario.BECOME_LANDMARK ) , Self.SELF );
		
		forward(1);
	}

	private void forward(int distance) throws InterruptedException, IOException {
		int d = distance + 1;

		put(new Tuple("victim", robotId, d), Self.SELF);
		// System.out.print("Robot "+robotId+" becomes a landmark with distance: "+d+"\n");
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
