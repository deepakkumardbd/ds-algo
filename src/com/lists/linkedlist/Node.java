package com.lists.linkedlist;

public class Node {
    private Employee emp;
    private Node next;
    public Node(Employee emp){
        this.emp = emp;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
