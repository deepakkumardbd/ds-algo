package com.graph;

import java.util.ArrayList;

public class GraphDS {
    int nodes;
    ArrayList<Integer> arr[];
    public GraphDS(int nodes){
        this.nodes = nodes;
        arr = new ArrayList[nodes];
        for(int i = 0;i < nodes; i++){
            arr[i] = new ArrayList<>();
        }
    }
    public void addEdges(int a, int b){
        arr[a].add(b);
        arr[b].add(a);
    }
    public void printGraph(){
        for(int i = 0; i < nodes; i++){
            System.out.print(i +" -> " );
            for(int j = 0; j < arr[i].size(); j++){
                System.out.print(arr[i].get(j));
            }
            System.out.println();
        }
    }
}
