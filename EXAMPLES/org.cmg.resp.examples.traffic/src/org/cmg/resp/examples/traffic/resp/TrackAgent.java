package org.cmg.resp.examples.traffic.resp;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

public class TrackAgent extends Agent {
	
	public TrackAgent(String name) {
		super(name);
	}

	@Override
	protected void doRun() {
		Tuple t;
		try {
			while(true){
				t = get(TrafficConstants.SPEED_TEMPLATE, Self.SELF);
				double speed = (Double) t.getElementAt(1);
				t = get(TrafficConstants.AVERAGE_SPEED_AC_TEMPLATE, Self.SELF);
				double avgSpeed = t.getElementAt(Double.class,1);
				int count = t.getElementAt(Integer.class,2);
				put( new Tuple( TrafficConstants.AVG_SPEED_AC_TAG , avgSpeed+speed , count+1),Self.SELF);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}
}
