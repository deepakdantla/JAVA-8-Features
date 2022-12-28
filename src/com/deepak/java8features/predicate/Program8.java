package com.deepak.java8features.predicate;

import java.util.function.Predicate;

public class Program8 {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("DURGASOFT");
        System.out.println(p.test("DURGASOFT"));
    }
}
