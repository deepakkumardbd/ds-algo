package com.lists.linkedlist;


public class Main {
    public static void main(String args[]){
        LinkedList employeelist = new LinkedList(new Employee(1,"deepak","cse"));
        employeelist.add(new Employee(2,"riya","cse"));
        employeelist.add(new Employee(3,"kappeed","cse"));
        employeelist.add(new Employee(4,"deepak","cse"));
        employeelist.printStack();
        System.out.println(employeelist.getSize());
    }
}
