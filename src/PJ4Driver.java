package graph;

import java.io.IOException;
import java.util.ArrayList;

public class PJ4Driver {
	public static void main(String[] args) throws IOException {
		// MST Implementation
		GreedyGraph MST = new MinimumSpanningTree(args[0]);
		System.out.println(MST);		
						
		MST.greedy(0);
		System.out.println("MST edges: ");
		
		double costMST = 0;
		for (int i = 1; i < MST.getOrder(); i++){
			System.out.print("(" + MST.getVertex(i).getParent());
			System.out.print(",");
			System.out.print(MST.getVertex(i).getIndex());
			System.out.print(",");
			System.out.print(MST.getVertex(i).getCost());
			System.out.println(")");
			costMST += MST.getVertex(i).getCost();
		}
		System.out.printf("%s MST cost=%f\n", args[0], costMST);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// SPT Implementation
		System.out.println("SPT edges: ");
		ShortestPathTree SPT = new ShortestPathTree(args[0]);
		ArrayList<Integer> shortPath = SPT.shortPath(0, SPT.getOrder()-1);
		
		double costSPT = 0;
		for (int i = 1; i < SPT.getOrder(); i++){
			GreedyVertex tail = SPT.getVertex(SPT.getVertex(i).getParent());
			GreedyVertex head = SPT.getVertex(i);
			System.out.print("(" + tail.getIndex());
			System.out.print(",");
			System.out.print(head.getIndex());
			System.out.print(",");
			System.out.print(head.getCost() - tail.getCost());
			System.out.println(")");
			costSPT += head.getCost() - tail.getCost();
		}
		
		System.out.printf("%s MST cost=%f", args[0], costSPT) ;
		
		// Output the path of the Shortest Path Tree
		System.out.printf("\nPath from %d to %d=", 0, SPT.getOrder()-1);
		System.out.println(shortPath);
		
		// Calculate cost distance for the shortest path
		double dist = 0;
		for(int i = 0; i < shortPath.size() - 1; i++){
			dist += SPT.weightOf(new Edge(shortPath.get(i), shortPath.get(i+1)));
		}
		System.out.println("Distance=" + dist);
	}
}
