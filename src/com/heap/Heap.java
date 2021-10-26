package com.heap;

import java.util.ArrayList;

public class Heap {
    ArrayList arr;
    public Heap(int count){
        arr = new ArrayList<Integer>(count);
    }
    public void addElement(int val){
        arr.add(val);
        heapify();
    }
    public void heapify(){
        int parent = ((arr.size()-1)-1)/2;
        int child = arr.size()-1;
        int val = (int)arr.get(child);
        int temp;
        while(parent > 0 && (int)arr.get(parent) <= val){
            temp = (int)arr.get(parent);
            arr.set(child,temp);
            child = parent;
            parent = (parent-1)/2;
        }
        if(parent == 0 && (int)arr.get(parent) < val){
            temp = (int)arr.get(parent);
            arr.set(child,temp);
            arr.set(parent,val);
        }else{
            arr.set(child,val);
        }
    }
    public void print(){
        for(int i = 0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}