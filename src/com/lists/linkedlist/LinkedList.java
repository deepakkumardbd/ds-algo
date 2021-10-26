package com.lists.linkedlist;

public class LinkedList {
    private Node head;
    private int size;
    public LinkedList(Employee employee){
        Node emp = new Node(employee);
        emp.setNext(head);
        head = emp;
        size = 1;
    }
    public void add(Employee employee){
        Node emp = new Node(employee);
        emp.setNext(head);
        head = emp;
        size++;
    }
    public void printStack(){
        Node current = head;
        while(current != null){
            System.out.print(current.getEmp()+"->");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}
