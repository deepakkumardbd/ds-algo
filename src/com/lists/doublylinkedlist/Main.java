package com.lists.doublylinkedlist;


import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        LinkedList employeelist = new LinkedList(new Employee(1,"deepak","cse"));
        employeelist.addFront(new Employee(2,"riya","cse"));
        employeelist.addFront(new Employee(3,"kappeed","cse"));
        Employee e4 = new Employee(4,"deepak","cse");
        employeelist.addBack(e4);
        employeelist.printStackFromFront();
        employeelist.printStackFromBack();
        System.out.println(employeelist.getSize());
        Employee e5 = new Employee(5,"riya","cse");
        employeelist.addBefore(e5,e4);
        employeelist.printStackFromFront();
        employeelist.printStackFromBack();

        // jdk defined list
        System.out.println("Using jdk LinkedList here");
        java.util.LinkedList<Employee> list = new java.util.LinkedList<>();
        list.addFirst(new Employee(2,"riya","cse"));
        list.addFirst(new Employee(3,"kappeed","cse"));
        list.addFirst(new Employee(4,"deepak","cse"));
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
