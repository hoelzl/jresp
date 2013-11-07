/**
 * 
 */
package org.cmg.resp.examples.cloud;

import java.util.HashMap;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Address;
import org.cmg.resp.topology.And;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.HasValue;
import org.cmg.resp.topology.IsLessThan;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.Target;


/**
 * @author Giorgio
 *
 */
/**
 * Questa classe rappresenta l'agente che gestisce le richieste
 */
public class RequestHandler extends Agent{
	
	//private Address localAddress;
	
	private HashMap<Integer,Object> sessions;
	
	private int counter;
	
	public RequestHandler() {
		super("Request Handler");
		//this.localAddress = localAddress;
	}

	@Override
	protected void doRun() throws Exception {
		while (true) {
		Tuple t = get(
				new Template(
						new ActualTemplateField("REQUEST") , 
						new FormalTemplateField(Integer.class) ,
						new FormalTemplateField(CloudService.class), 
						new FormalTemplateField(Target.class) 
				)
				,
				Self.SELF
		);

		int sessionId = t.getElementAt(Integer.class , 1 );
		CloudService service = t.getElementAt(CloudService.class, 2);
		Target clientAddress = t.getElementAt(Target.class , 3);
		
		Tuple mem_inf = query( CloudComponent.MEMORY_SENSOR_TEMPLATE , Self.SELF);
		Tuple cpu_inf = query( CloudComponent.CPU_SENSOR_TEMPLATE , Self.SELF);
		
		int memValue = mem_inf.getElementAt(Integer.class, 1);
		
		double cpuValue = cpu_inf.getElementAt(Double.class, 1);
		
		
		if((memValue<500)&&(cpuValue<60.0)){
			exec( new ServiceCaller(sessionId, service, clientAddress));
		}else{
			GroupPredicate ot1 = new IsLessThan("MEMORY", 500);
			GroupPredicate ot2 = new IsLessThan("CPU", 60.0);
			GroupPredicate ot3 = new HasValue( t.getElementAt(String.class , 0) , true );
			put(new Tuple("FORWARD", sessionId , service , clientAddress), new Group(new And(new And(ot1, ot2) , ot3 )));
		}
	}
  }
}
