package com.stack;

public class Employee {
    private int eid;
    private String name;
    private String dept;
    public Employee(int eid, String name, String dept){
        this.eid = eid;
        this.name = name;
        this.dept = dept;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
