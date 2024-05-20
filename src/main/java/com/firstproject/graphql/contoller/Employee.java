package com.firstproject.graphql.contoller;

class Employee {

    private String name;
    private int age;
    private Long salary;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public Long getSalary(){
        return this.salary;
    }

    public Employee(String name, int age, Long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    /**
     *
     * Setters as follows
     */
}
