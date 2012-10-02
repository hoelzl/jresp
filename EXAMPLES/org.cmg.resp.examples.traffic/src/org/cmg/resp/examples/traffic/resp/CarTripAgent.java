package org.cmg.resp.examples.traffic.resp;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.examples.traffic.data.Trip;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

public class CarTripAgent extends Agent {
	
	private Trip trip;
	

	public CarTripAgent( String name ) {
		super(name);
	}

	@Override
	protected void doRun() {
		Tuple t;
		try {
			t = query(TrafficConstants.TRIP_TEMPLATE, Self.SELF);
			trip = (Trip) t.getElementAt(1);
			System.out.println("Track info:"+trip);
			for( int i=0 ; i<trip.size() ; i++ ) {
				put( new Tuple( "TRACK_INFO" , trip.get(i).getName() , i , -1.0 ) , Self.SELF );
			}
			put( new Tuple( "TRIP_INFO" , 0 , trip.size() ) , Self.SELF );
			while(!trip.isEmpty()) {
				for( int i=0 ; i<trip.size() ; i++ ) {
					System.out.println("Retrieving data from "+trip.get(i).getName());
					t = query( TrafficConstants.AVG_SPEED_TEMPLATE , trip.get(i).getAddress() );
					double average = t.getElementAt(Double.class, 1);
					put( new Tuple( "UPDATING" , i ) , Self.SELF );					
					get( new Template( 
						new ActualTemplateField("TRACK_INFO"),
						new ActualTemplateField(trip.get(i).getName()),
						new FormalTemplateField( Integer.class ),
						new FormalTemplateField(Double.class) ) ,
						Self.SELF );
					put( new Tuple( "TRACK_INFO" , trip.get(i).getName() , i , average ) , Self.SELF );						
					get( new Template( 
								new ActualTemplateField("UPDATING") ,
								new ActualTemplateField(i)
							) 
						, 
						Self.SELF 
					);
					System.out.println("Average speed of "+trip.get(i).getName()+" updated: "+average);
				}
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
