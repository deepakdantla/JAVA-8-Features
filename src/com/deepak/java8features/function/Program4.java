package com.deepak.java8features.function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }
}

public class Program4 {
    public static void main(String[] args) {
        ArrayList<Employee>  l = new ArrayList<>();
        populate(l);

        Function<ArrayList<Employee>, Double> f = l1->{
          double total=0;
          for(Employee e: l1){
              total += e.salary;
          }
          return total;
        };

        System.out.println("The total salary of this month:" + f.apply(l));
    }

    private static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Sunny",1000));
        l.add(new Employee("Bunny",2000));
        l.add(new Employee("Chinny",3000));
        l.add(new Employee("Pinny",4000));
        l.add(new Employee("Vinny",5000));
        l.add(new Employee("Durga",10000));
    }
}
