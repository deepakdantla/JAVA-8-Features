package com.deepak.java8features.predicate;

import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGF;

    public SoftwareEngineer(String name, int age, boolean isHavingGF) {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Program6 {
    public static void main(String[] args) {

        SoftwareEngineer[] list = {new SoftwareEngineer("Durga",60,false),
                                   new SoftwareEngineer("Sunil",26,true),
                                   new SoftwareEngineer("Sayan",26,true),
                                   new SoftwareEngineer("Subbu",28, false),
                                   new SoftwareEngineer("Ravi",17, true)
                                  };

        Predicate<SoftwareEngineer> allowed = se -> se.age > 18 && se.isHavingGF;

        for(SoftwareEngineer se: list){
            if(allowed.test(se)){
                System.out.println(se);
            }
        }
    }
}
