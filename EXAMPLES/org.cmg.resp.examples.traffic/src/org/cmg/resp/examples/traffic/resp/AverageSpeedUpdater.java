package org.cmg.resp.examples.traffic.resp;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.examples.traffic.data.CarState;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

public class AverageSpeedUpdater extends Agent {
	
	private static int updateFrequency = 1000;

	public AverageSpeedUpdater(String name) {
		super(name);
	}

	@Override
	protected void doRun() {
		int i = 0;
		double avgSpeed = -1;
		Tuple t;
		try {
			put(new Tuple(TrafficConstants.AVG_SPEED_AC_TAG,0.0,0),Self.SELF);
			put(new Tuple(TrafficConstants.AVG_SPEED_TAG, avgSpeed), Self.SELF);
			put(new Tuple(TrafficConstants.STATE_TAG, CarState.RUN), Self.SELF);
			while(true){
				Thread.sleep(updateFrequency);
				t = get(TrafficConstants.AVERAGE_SPEED_AC_TEMPLATE, Self.SELF);
				put(new Tuple(TrafficConstants.AVG_SPEED_AC_TAG,0.0,0),Self.SELF);
				double total = t.getElementAt(Double.class, 1);
				int count = t.getElementAt(Integer.class, 2);
				if (count > 0) {
					avgSpeed = total/count;
				} else {
					avgSpeed = -1;
				}
				get(TrafficConstants.AVG_SPEED_TEMPLATE, Self.SELF);
				put(new Tuple(TrafficConstants.AVG_SPEED_TAG, avgSpeed), Self.SELF);
				get(TrafficConstants.STATE_TEMPLATE, Self.SELF);
				put(new Tuple(TrafficConstants.STATE_TAG, getTrackState(avgSpeed)), Self.SELF);
				System.out.println(getName()+": Average speed="+avgSpeed);
				i = 0;
				avgSpeed = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private CarState getTrackState(double avgSpeed) {
		if (avgSpeed<0) {
			return CarState.RUN;
		}
		if(avgSpeed < 25)
			return CarState.JAM;
		else if (avgSpeed > 50)
			return CarState.RUN;
		else return CarState.LIGHT_JAM;
	}

}
