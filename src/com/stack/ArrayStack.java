package com.stack;

public class ArrayStack{
    private int size;
    private int init;
    Employee emp [];
    public ArrayStack(int size){
        this.size = size;
        this.init = 0;
        emp = new Employee[size];
    }

    public void push(Employee e){
        emp[init++] = e;
    }
    public Employee pop(){
        return emp[--init];
    }
    public Employee peek(int num){
        return emp[num];
    }
}
