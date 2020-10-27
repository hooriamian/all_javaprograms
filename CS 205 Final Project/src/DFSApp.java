import java.util.Scanner;

public class DFSApp 
{
	
	public static void main(String[] args)
    {
		Scanner in = new Scanner (System.in);

	    /////////////////////////////////////////FINAL CONTECTIVITY GRAPH
		Graph theGraph = new Graph();
		
	    theGraph.addVertex('A');   //0 
	    theGraph.addVertex('B');   //1 
	    theGraph.addVertex('C');   //2
	    theGraph.addVertex('D');   //3
	    theGraph.addVertex('E');   //4
    
    

	    theGraph.addEdge(0, 1, 50);     // AB
	    theGraph.addEdge(1, 2, 60);     // BC
	    theGraph.addEdge(0, 3, 80);     // AD
	    theGraph.addEdge(3, 4, 80);     // DE
	    theGraph.addEdge(2, 4, 40);     // CE
	    theGraph.addEdge(3, 2, 20);     // DC
	    theGraph.addEdge(4, 1, 50);     // EB
	    theGraph.addEdge(1, 3, 95);     // DC

	    System.out.println("Visits: ");
	    theGraph.dfs();     
	    
    } 

}

/********EXTRA CODE**************
 * Graph Graph2 = new Graph();

	    int length = 5;
	    
	    for (int i = 0; i <= length; i++)
	    {
	    	System.out.println("Add a vertex : ");
	    	char vertex1 = in.next().charAt(0);
	    	//add new vertex
	    	Graph2.addVertex(vertex1);
	    }
	    
	    int length2 = 8;
	    
	    for (int i = 0; i <= length2; i++)
	    {
	    	System.out.println("Add an edge starting point : ");
	    	int edgeStart = in.nextInt();
	    	
	    	System.out.println("Add an edge ending point : ");
	    	int edgeEnd = in.nextInt();
	    	
	    	System.out.println("Add an edge distance : ");
	    	int edgeDistance = in.nextInt();

	    	//add new edge
	    	Graph2.addEdge(edgeStart, edgeEnd, edgeDistance);
	    	*/
