package com.deepak.java8features.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Program3 {
    public static void main(String[] args) {

        Predicate<Collection> p = c->c.isEmpty();
        ArrayList l1 = new ArrayList();
        l1.add("A");
        System.out.println(p.test(l1)); //false
        ArrayList l2 = new ArrayList();
        System.out.println(p.test(l2)); //true
    }
}
