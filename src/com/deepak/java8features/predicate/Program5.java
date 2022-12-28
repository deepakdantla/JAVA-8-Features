package com.deepak.java8features.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

// to remove null and empty strings in string array
public class Program5 {
    public static void main(String[] args) {
        String [] names = {"Durga", " ", null, "Ravi", " " ,null, "Shiva"};

        Predicate<String> p = s->s!= null && s.length()!=0;
        ArrayList<String> l = new ArrayList<>();

        for(String s: names){
            if(p.test(s)){
                l.add(s);
            }
        }
        System.out.println("The valid names list:");
        System.out.println(l);
    }
}
