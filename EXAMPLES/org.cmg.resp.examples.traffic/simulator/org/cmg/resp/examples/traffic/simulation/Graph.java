package org.cmg.resp.examples.traffic.simulation;

import java.util.LinkedList;
import java.util.Random;

import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.examples.traffic.data.Trip;

public class Graph {
	
	private LinkedList<GraphNode> nodes;
	private LinkedList<GraphLink> links;
	private int[] startingElements;
	private int trackNumber, carNumber;
	
	
	public Graph(LinkedList<TrackSimulation> tracks, int carNumber) {
		links = new LinkedList<GraphLink>();
		nodes = new LinkedList<GraphNode>();
		trackNumber = tracks.size();
		this.carNumber = carNumber;
		buildGraph(tracks);
		initializeStartingElements();
	}


	private void initializeStartingElements() {
		startingElements = new int[nodes.size()];
		int elements = carNumber / nodes.size();
		int inserted = 0;
		for(int i=0;i<nodes.size();i++){
			startingElements[i] = elements;
			inserted = inserted + elements;
		}
		int i = 0;
		while(carNumber > inserted){
			startingElements[i]++;
			inserted++;
			i++;
		}	
	}


	private void buildGraph(LinkedList<TrackSimulation> tracks) {
		GraphNode currentNode;
		GraphLink link;
		LinkedList<Integer> exitLinks = defineExitLinks((int)(trackNumber / 2), trackNumber);
		for(int i=0;i<exitLinks.size();i++) {
			nodes.add(new GraphNode("Node" + i));
		}
		for(int i=0;i<exitLinks.size();i++) {
			for(int j=0;j<exitLinks.get(i);j++) {
				currentNode = nodes.get(i);
				link = new GraphLink(currentNode, selectRandomNode(currentNode), tracks.remove());
				links.add(link);
				currentNode.addExitLink(link);
			}
		}
	}

	private GraphNode selectRandomNode(GraphNode current) {
		Random rand = new Random();
		LinkedList<GraphNode> busyNodes = new LinkedList<GraphNode>();
		GraphNode node;
		busyNodes.add(current);
		for(int i=0;i<current.getExitNodesNumber();i++)
			busyNodes.add(current.getExitLink(i).getEndNode());
		node = nodes.get(rand.nextInt(nodes.size()));
		while(isIn(busyNodes, node)){
			node = nodes.get(rand.nextInt(nodes.size()));
		}
		return node;	
	} 
	
	private boolean isIn(LinkedList<GraphNode> busyNodes, GraphNode node) {
		for(int i=0;i<busyNodes.size();i++){
			if(node == busyNodes.get(i))
				return true;
		}
		return false;
			
	}

	private LinkedList<Integer> defineExitLinks(int nodeNumber, int trackNumber) {
		LinkedList<Integer> exitLinks = new LinkedList<Integer>();
		int sum = 0, partial = trackNumber / nodeNumber;
		for(int i=0;i<nodeNumber;i++){
			exitLinks.add(partial);
			sum = sum + partial;
		}
		if(sum < trackNumber){
			exitLinks.removeLast();
			exitLinks.add(partial + (trackNumber - sum));
		}
		return exitLinks;
	}
	
	public Trip selectRandomTrip(GraphNode startNode, String carName){
		System.out.println(carName + " enters in " + startNode.getName());
		LinkedList<TrackSimulation> trip = new LinkedList<TrackSimulation>();
		double pGo = 100;
		double step = 100 / nodes.size();
		GraphNode current = startNode;
		GraphLink link;
		Random rand = new Random();
		while(true) {
			if(!current.hasExitNodes())
				break;
			if(rand.nextDouble()*100 < pGo) {
				link = current.selectRandomLink();
				current = link.getEndNode();
				trip.add(link.getTrack());
			}
			else break;
			pGo = pGo - step;
		}
		Track[] tracks = new Track[trip.size()];
		for(int i=0;i<trip.size();i++)
			tracks[i] = trip.get(i).getTrack();
		return new Trip(carName, tracks);
	}
	
	public GraphNode getDefaultStartNode(){
		return selectRandomNode();
	}

	private GraphNode selectRandomNode() {
		Random rand = new Random();
		int index = rand.nextInt(startingElements.length);
		while(startingElements[index] == 0){
			index = rand.nextInt(startingElements.length);
		}
		startingElements[index]--;
		return nodes.get(index);
	}


	@Override
	public String toString() {
		String message = "nodes: ";
		for(GraphNode gn : nodes)
			message = message + gn.getName() + ", ";
		message = message + "\nlinks: ";
		for(GraphLink gl : links)
			message = message + gl.getTrack().getTrack().getName() + ", ";
		return message;
	}


	public Trip selectRandomTrip(String carName) {
		return selectRandomTrip(getDefaultStartNode(), carName);
	}
	
	

}
