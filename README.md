# CS241PA4
Greedy Graph Algorithm

Project 4 – Greedy Graph Algorithms

1.	Requirements: 
This project solves two problems using two different variants of the greedy algorithm for graphs. The first problem asked for the minimum cost spanning tree and the second problem asked for the single source shortest path tree, both using the same graph. 

2.	Method:
	The project utilized the source code provided which included the files Edge.java, Graph.java, GreedyGraph.java, GreedyPriorityQueue.java, GreedyVertex.java, and Vertex.java. To look at the different problems, MinimumSpanningTree.java and ShortestPathTree.java were created to override the newCost function to interface with the greedy function in the GreedyGraph.java class. A PJ4Driver.java program was also created to run the two solutions and compare the differences.

3.	Implementation:
	The program utilized a Driver class which instantiated the graph constructs that utilized the different solutions. For the minimum spanning tree, a newCost method was written to override the newCost method within the GreedyGraph.java class. Because the algorithm for a minimum spanning tree using the greedy algorithm only looked at the cost of adding a potential adjacent node when deciding which node to add next, the newCost method only looked at the cost of the next node. However, when solving for the shortest path tree, the algorithm also looked at the cost of the current node from the source when trying to find the exit node. This results in a tree that is overall costlier, but will also result in the lowest cost when going from a source node to an exit node. 

4.	Testing:
	To ensure that the sorting algorithms operated correctly, the supplied test files also included four test cases which included graph10.txt, graph11.txt, graph12.txt, and graph13.txt. The program was executed with these supplied test cases with the Boolean debug set to ‘true’ in the GreedyGraph.java class to trace the function calls in the program. The test cases were executed and the first test case was compared to a diagram traced with the function calls of the methods. 

5.	Findings: 
	From this project, I learned to override a method that was designed to be modular enough to be used in different cases. I also learned about the differences between the greedy algorithms and how one may be more beneficial than another.
