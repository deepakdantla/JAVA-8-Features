package com.deepak.java8features.supplier;

import java.util.function.Supplier;

public class Program2 {
    public static void main(String[] args) {
        Supplier<String> s = ()->{
            String s1[] = {"sunny","bunny","chinny","vinny"};
            int x = (int)( Math.random() * 4);
            return s1[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
