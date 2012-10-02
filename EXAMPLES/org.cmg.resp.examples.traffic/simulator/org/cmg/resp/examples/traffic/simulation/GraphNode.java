package org.cmg.resp.examples.traffic.simulation;

import java.util.LinkedList;
import java.util.Random;


public class GraphNode {
	
	private String name;
	private LinkedList<GraphLink> exitLinks;
	
	public GraphNode(String name){
		this.name = name;
		exitLinks = new LinkedList<GraphLink>();
	}
	
	public GraphNode(String name, LinkedList<GraphLink> links){
		this(name);
		exitLinks = links;
	}
	
	public GraphLink selectRandomLink(){
		Random rand = new Random();
		return exitLinks.get(rand.nextInt(exitLinks.size()));
	}

	public void addExitLink(GraphLink newLink) {
		exitLinks.add(newLink);		
	}
	
	public GraphLink getExitLink(int i){
		return exitLinks.get(i);
	}
	
	public int getExitNodesNumber(){
		return exitLinks.size();
	}

	public boolean hasExitNodes() {
		return exitLinks.size() > 0;
	}

	public String getName() {
		return name;
	}

}
