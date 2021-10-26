package com.lists.ArrayList;

import com.lists.linkedlist.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List employeelist = new ArrayList<Employee>();
        employeelist.add(new Employee(1,"deepak","cse"));
        employeelist.add(new Employee(2,"riya","cse"));
        employeelist.add(new Employee(3,"kappeed","cse"));
        employeelist.add(new Employee(4,"deepak","cse"));
        employeelist.forEach(employee -> System.out.println(employee));
    }
}
