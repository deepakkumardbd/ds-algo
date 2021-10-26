package com.lists.doublylinkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(Employee employee){
        Node emp = new Node(employee);
        emp.setNext(null);
        emp.setPrev(null);
        head = emp;
        tail = emp;
        size++;
    }
    public void addFront(Employee employee){
        Node emp = new Node(employee);
        emp.setNext(head);
        emp.setPrev(null);
        head.setPrev(emp);
        head = emp;
        size++;
    }
    public void addBack(Employee employee){
        Node emp = new Node(employee);
        emp.setPrev(tail);
        emp.setNext(null);
        tail.setNext(emp);
        tail = emp;
        size++;
    }


    public void addBefore(Employee e1, Employee e2){
        Node emp = new Node(e1);
        Node current = head;
        while(current != null && !current.getEmp().equals(e2) && !current.getNext().getEmp().equals(e2)){
            current = current.getNext();
        }
        if(current.getNext().getEmp().equals(e2)){
            emp.setNext(current.getNext());
            current.setNext(emp);
            emp.getNext().setPrev(emp);
            emp.setPrev(current);
        }
        size++;
    }


    public void printStackFromFront(){
        Node current = head;
        while(current != null){
            System.out.print(current.getEmp()+"->");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public void printStackFromBack(){
        Node current = tail;
        while(current != null){
            System.out.print(current.getEmp()+"->");
            current = current.getPrev();
        }
        System.out.println("null");
    }
    public int getSize() {
        return size;
    }
}
