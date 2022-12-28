package com.deepak.java8features.function;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
    String name;
    double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }
}


public class Program5 {

    public static void main(String[] args) {
        ArrayList<Employee1> l = new ArrayList<>();
        populate(l);

        System.out.println("Before Increment:");
        System.out.println(l);

        Predicate<Employee1> p=e->e.salary<3500;

        Function<Employee1, Employee1> f = e -> {
            e.salary = e.salary+477;
            return e;
        };

        System.out.println("After Increment:");
        ArrayList<Employee1> l2=new ArrayList<Employee1>();
        for(Employee1 e: l){
            if(p.test(e)){
                l2.add(f.apply(e));
            }
        }

        System.out.println(l);
        System.out.println("Employees with incremented salary:");
        System.out.println(l2);
    }

    private static void populate (ArrayList < Employee1 > l) {
        l.add(new Employee1("Sunny", 1000));
        l.add(new Employee1("Bunny", 2000));
        l.add(new Employee1("Chinny", 3000));
        l.add(new Employee1("Pinny", 4000));
        l.add(new Employee1("Vinny", 5000));
        l.add(new Employee1("Durga", 10000));
    }

}