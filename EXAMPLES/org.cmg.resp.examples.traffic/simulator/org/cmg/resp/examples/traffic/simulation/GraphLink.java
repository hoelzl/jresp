package org.cmg.resp.examples.traffic.simulation;

public class GraphLink {
	
	private GraphNode start, end;
	private TrackSimulation track;
	
	public GraphLink(GraphNode start, GraphNode end, TrackSimulation track) {
		super();
		this.start = start;
		this.end = end;
		this.track = track;
	}
	
	public GraphNode getStartNode(){
		return start;
	}
	
	public GraphNode getEndNode(){
		return end;
	}
	
	public TrackSimulation getTrack(){
		return track;
	}
	

}
