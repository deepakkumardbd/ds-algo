package com.trees;

public class Main {
    public static void main(String args[]){
        Employee e1 = new Employee(40,"deepak","cse");
        Employee e2 = new Employee(35,"riya","cse");
        Employee e3 = new  Employee(45,"kappeed","cse");
        Employee e4 = new Employee(32,"deepak","cse");
        Employee e5 = new Employee(38,"deepak", "se");
        Tree tree = new Tree(e1);
        tree.addNode(e2);
        tree.addNode(e3);
        tree.addNode(e4);
        tree.addNode(e5);
        tree.print();
    }
}
