package com.abstraction;

public class Main {
    public static void main(String args[]){
        Vehicle v = new Car();
        v.print();
        Vehicle vm = new Vehicle() {
            @Override
            public void print() {
                System.out.println("hello inside vm");
            }
        };
        vm.print();
    }
}
