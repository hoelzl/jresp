/**
 * 
 */
package org.cmg.resp.examples.cloud;

import java.util.HashMap;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Address;
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
	
	private Address localAddress;
	
	private HashMap<Integer,Object> sessions;
	
	private int counter;
	
	public RequestHandler( Address localAddress ) {
		super("Request Handler");
		this.localAddress = localAddress;
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
		
		
//		if(((Long)mem_inf.getElementAt(1)<500)&&((Double)cpu_inf.getElementAt(1)<60.0)){
//			if((((CloudComp) t.getElementAt(3)).Disponibility((String)t.getElementAt(0)))){
//				   System.out.println(((CloudComp) t.getElementAt(3)).invoke((String)t.getElementAt(0), t.getElementAt(1)));
//			    }
//			else {
//				if(((CloudComp) t.getElementAt(3)).Type_Of_Service((String)t.getElementAt(0)).equals(Type_Of_Service.MULTI_ISTANZA)){
//					System.out.println(((CloudComp) t.getElementAt(3)).invoke((String)t.getElementAt(0), t.getElementAt(1)));
//				}else {
					exec( new ServiceCaller(sessionId, service, clientAddress));
//				}
//		}
//		
//	}else{
//		GroupPredicate ot1 = new IsLessThan("mem", 500);
//		GroupPredicate ot2 = new IsLessThan("load", 60.0);
//		GroupPredicate ot3 = new HasValue( t.getElementAt(String.class , 0) , true );
//		put(new Tuple("FORWARD", t.getElementAt(0) , t.getElementAt(1) , t.getElementAt(3),localAddress), new Group(new And(new And(ot1, ot2) , ot3 )));
//	}
//		}
		}
  }
}
