package org.cmg.resp.examples.traffic.resp;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

public class CarSpeedAgent extends Agent {

	public CarSpeedAgent(String name) {
		super(name);
	}

	@Override
	protected void doRun() {
		Tuple t;
		double speed;
		Track newTrack;
		try {
			boolean arrived = true;
			while(arrived){
				Thread.sleep(1000);
				t = query(  TrafficConstants.SPEED_TEMPLATE , Self.SELF );
				speed = (Double) t.getElementAt(1);
				t = query( TrafficConstants.TRACK_TEMPLATE , Self.SELF );
				newTrack = (Track) t.getElementAt(1);
				if(newTrack != Track.FINAL_TRACK) {
					put(new Tuple(TrafficConstants.SPEED_TAG, speed), newTrack.getAddress());
				} else {
					arrived = false;
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
