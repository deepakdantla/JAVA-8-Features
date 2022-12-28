package com.deepak.java8features.predicate;

import java.util.function.Predicate;

// if the input number is > 10
public class Program1 {

    public static void main(String[] args) {
        Predicate<Integer> p = I -> I >10;
        System.out.println(p.test(100)); //true
        System.out.println(p.test(5)); // false
//        System.out.println(p.test("Deepak")); we get compile time error
    }
}
