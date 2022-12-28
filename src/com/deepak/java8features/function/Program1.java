package com.deepak.java8features.function;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.function.Function;

public class Program1 {
    public static void main(String[] args) {
        Function<String,Integer> f = s->s.length();
        System.out.println(f.apply("durga"));
        System.out.println(f.apply("durgasoft"));

        Function<Integer,Integer> f2 = I->I*I;
        System.out.println(f2.apply(10));
        System.out.println(f2.apply(12));
    }
}
