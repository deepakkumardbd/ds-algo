package com.heap;


//Heap is a a complete tree with heap properties, in which either the parent is greater than the child(Max-heap)
//or parent is less than the child (min-heap)

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Heap heap = new Heap(5);
        heap.print();
        heap.addElement(5);
        heap.addElement(12);
        heap.print();
        heap.addElement(7);
        heap.addElement(35);
        heap.addElement(38);
        heap.print();
        heap.addElement(11);
        heap.addElement(10);
        heap.print();
    }
}
