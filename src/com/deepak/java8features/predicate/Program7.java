package com.deepak.java8features.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        String s = String.format("(%s,%s,%.2f,%s)",
                name,designation,salary,city);
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (name.equals(e.name)&&designation.equals(e.designation)&&city.equals(e.city)&&salary==e.salary)
            return true;
        else
            return false;
    }
}

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        populate(list);
        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        System.out.println("Managers are: \n");
        display(p1,list);

        // City is Bangalore
        Predicate<Employee> p2 = emp->emp.city.equals("Bangalore");
        System.out.println("Bangalore employees are:\n");
        display(p2,list);

        // Salary < 20k
        Predicate<Employee> p3 = emp->emp.salary < 20000;
        System.out.println("Employees with salary < 20k:\n");
        display(p3,list);

        // Managers to give pink slip to
        System.out.println("All Managers from Bangalore to give pink slip:\n");
        display(p1.and(p2),list);

        // To select all employees who are managers or salary < 20k
        System.out.println("All Managers from Bangalore to give pink slip:\n");
        display(p1.or(p3),list);

        // To select all employees who are not managers
        System.out.println("All employees who are not managers:\n");
        display(p1.negate(),list);

        // to check if the employee is a CEO using predicate
        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Deepak","CEO",70000,"Hyderabad"));
        Employee e1 = new Employee("Deepak","CEO",70000,"Hyderabad");
        Employee e2 = new Employee("Barath","Manager",50000,"Hyderabad");
        System.out.println(isCEO.test(e1)); //true
        System.out.println(isCEO.test(e2)); //false
    }

    private static void display(Predicate<Employee> p, ArrayList<Employee> list) {
        for(Employee emp : list){
            if(p.test(emp)){
                System.out.println(emp);
            }
        }
        System.out.println("***********************||***************||********************");
    }

    private static void populate(ArrayList<Employee> list) {
        list.add(new Employee("Deepak","CEO",30000,"Hyderabad"));
        list.add(new Employee("Barath","Developer",15000,"Bangalore"));
        list.add(new Employee("Sai","Manager",50000,"Bangalore"));
        list.add(new Employee("Bharat Nag","Developer",30000,"Hyderabad"));
        list.add(new Employee("Kishore","Team Lead",30000,"Hyderabad"));
        list.add(new Employee("John","Developer",10000,"Hyderabad"));
        list.add(new Employee("Ashish","Manager",30000,"Bangalore"));
        list.add(new Employee("Praveen","Developer",30000,"Bangalore"));
    }
}
