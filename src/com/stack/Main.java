package com.stack;

import java.util.LinkedList;

public class Main {
    public static void main(String args[]){
        ArrayStack emp = new ArrayStack(5);
        Employee e1 = new Employee(1,"deepak","cse");
        Employee e2 = new Employee(2,"lakshya","cse");
        Employee e3 = new Employee(3,"punit","comm");
        Employee e4 = new Employee(4,"Riya","cse");
        Employee e5 = new Employee(5,"saxena","comedy");
        emp.push(e1);
        emp.push(e2);
        emp.push(e3);
        System.out.println(emp.pop());
        System.out.println(emp.pop());
        System.out.println(emp.peek(0));

        System.out.println("Printing jdk linked list array");
        
        LinkedList stack = new LinkedList<Employee>();
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
