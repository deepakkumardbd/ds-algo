package com.graph;

public class Main {
    public static void main(String args[]){
        GraphDS graph = new GraphDS(6);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(1,3);
        graph.addEdges(2,4);
        graph.addEdges(2,5);
        graph.addEdges(3,5);
        graph.printGraph();
    }
}

