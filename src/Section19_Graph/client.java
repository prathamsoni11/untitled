package Section19_Graph;

import java.util.HashMap;

public class client {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A","B",2);
        graph.addEdge("A","D",10);
        graph.addEdge("B","C",3);
        graph.addEdge("C","D",1);
        graph.addEdge("D","E",8);
        graph.addEdge("E","F",5);
        graph.addEdge("E","G",6);
        graph.addEdge("F","G",4);

        graph.display();

//        System.out.println(graph.hasPath("A","F",new HashMap<>()));
//        System.out.println(graph.BreadthFirstSearch("A","F"));
//        System.out.println(graph.DepthFirstSearch("A","F"));

//        graph.BreadthFirstTraversal();

//        graph.DepthFirstTraversal();

//        System.out.println(graph.isCyclic());

//        System.out.println(graph.isConnected());

        System.out.println("------------------------------");
        graph.prims().display();
        System.out.println("------------------------------");
        System.out.println(graph.dijkstra("A"));


    }
}
