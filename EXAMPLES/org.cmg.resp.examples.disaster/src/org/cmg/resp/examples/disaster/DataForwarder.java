	package org.cmg.resp.examples.disaster;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.HasValue;
import org.cmg.resp.topology.Self;

public class DataForwarder extends Agent {
	
	private int robotId;

	public DataForwarder( int robotId ) {
		super("DataForwarder");	
		this.robotId = robotId;
	}
	
	@Override
	protected void doRun() throws IOException, InterruptedException{
			Tuple t = query(new Template(
					 			new ActualTemplateField("victim") , 
					 			new FormalTemplateField(Integer.class), 
					 			new FormalTemplateField(Integer.class)), 
					 			new Group(new HasValue( "role" , Scenario.LANDMARK ) ));
			int d = t.getElementAt(Integer.class, 2);
			
			put( new Tuple( "stop" ) , Self.SELF );
//			put( new Tuple( "stop" , Scenario.BECOME_LANDMARK ) , Self.SELF );
			forward(d);						
	}
	
	private void forward(int distance) throws InterruptedException, IOException {
		int d = distance+1;
		put( new Tuple( "victim" , robotId , d ) , Self.SELF );
		System.out.print("Robot "+robotId+" becomes a landmark with distance: "+d+"\n");
	}
}
