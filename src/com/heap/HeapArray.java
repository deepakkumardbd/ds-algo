package com.heap;

import java.util.Scanner;

public class HeapArray {
    private int heap[];
    private int currentSize;
    public HeapArray(int size){
        heap = new int[size];
        currentSize = -1;
    }
    public void insertHeap(int element){
        heap[++currentSize] = element;
        heapify();
    }
    public void heapify(){
        int child = currentSize ;
        int parent = (child - 1)/2;
        int element = heap[child];
        while( parent > 0 && heap[parent] > element){
            heap[child] = heap[parent];
            child = parent;
            parent = (parent - 1)/2;
        }
        if(parent == 0 && heap[parent] > element){
            heap[child] = heap[parent];
            heap[parent] = element;
        }else{
            heap[child] = element;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the heap");
        int size = sc.nextInt();
        HeapArray hp = new HeapArray(size);
        System.out.println("Enter the numbers");
        for(int i =0; i<size; i++){
            hp.insertHeap(sc.nextInt());
            hp.printHeap();
        }
        hp.printHeap();
    }

    public void printHeap(){
        for(int i = 0;i<=currentSize;i++){
            System.out.print(" "+heap[i]);
        }
        System.out.println();
    }
}
