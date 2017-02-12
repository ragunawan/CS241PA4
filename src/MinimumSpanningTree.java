package graph;

import java.io.IOException;

public class MinimumSpanningTree extends GreedyGraph {
	public MinimumSpanningTree(String x) throws IOException {
		super(x);
	}

    // Minimal Spanning Tree newCost calculation:	
	public double newCost(int v, int w){
		// compares cost as the most 'cheapest' potential at the current time
		return this.getEdge(v,w).getWeight();
	}
}