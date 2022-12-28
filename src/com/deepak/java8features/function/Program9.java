package com.deepak.java8features.function;

import java.util.function.Function;

public class Program9 {
    public static void main(String[] args) {
        Function<String,String> f1= Function.identity();
        String s2 = f1.apply("deepak");
        System.out.println(s2);
    }
}
