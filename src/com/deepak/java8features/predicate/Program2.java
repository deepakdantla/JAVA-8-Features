package com.deepak.java8features.predicate;

import java.util.function.Predicate;

// if the length of the string is > 5
public class Program2 {
    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("abcdef")); // true
        System.out.println(p.test("abc")); // false
    }
}
