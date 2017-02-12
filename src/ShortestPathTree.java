package graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ShortestPathTree extends GreedyGraph{
	public ShortestPathTree(String name) throws IOException {
		super(name);
	}
	
	public ArrayList<Integer> shortPath(int start, int end){
		// used an ArrayList of integers to store the indexes of the shortest path
		ArrayList<Integer> path = new ArrayList<>();
		greedy(start);
		
		// going from the end to the start
		while (getVertex(end) != getVertex(start)) {
			path.add(end);	
			end = getVertex(end).getParent();
		}
		path.add(start);
		// reverse path
		Collections.reverse(path);
		return path;
	}
	
	// Shortest Path Tree newCost calculation:
	public double newCost(int v, int w){
		// compares the cost of the current + the edge identified
		return this.costOf(v) + weightOf(this.getEdge(v,w));
	}
}