package com.farhan.others;

public class ConstructorChain {
    String name;
    long phone;
    String job;
    String deptno;
    int salary;
    int exp;

    public ConstructorChain() {
    	this("farhan");
        System.out.println("no arguement constructor");
        
    }

    public ConstructorChain(String name) {
    	this(9393396691L, "software developer");
        System.out.println("constructor with one arguement");
        this.name = name;
        
    }

    public ConstructorChain(long phone, String job) {
    	this("22L", 20000, 3);
        System.out.println("constructor with two arguements");
        this.phone = phone;
        this.job = job;
        
    }

    public ConstructorChain(String deptno, int salary, int exp) {
        System.out.println("constructor with three arguements");
        this.deptno = deptno;
        this.salary = salary;
        this.exp = exp;
    }

    public void display() {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(job);
        System.out.println(deptno);
        System.out.println(salary);
        System.out.println(exp);
    }
}
