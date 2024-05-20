package com.firstproject.graphql.contoller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public  class MainApp {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("raj",35,56000L),
                new Employee("deepak",35,50000L),
                new Employee("gopal",25,30000L),
                new Employee("alec",29,70000L),
                new Employee("sam",35,38000L),
                new Employee("rounak",32,55000L),
                new Employee("sunny",31,59000L));

        List<String> list = employees.stream().filter(obj -> obj.getAge() > 30).sorted(Comparator.comparing(Employee::getSalary).reversed())//list
                .map(obj -> obj.getName())//string
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(list);


        try {
            System.out.println("Inside try block");
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Inside exception catch block");
        }
        finally{
            System.out.println("Finally block");
        }
    }

}
