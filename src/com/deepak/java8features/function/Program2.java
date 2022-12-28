package com.deepak.java8features.function;

import java.util.function.Function;

public class Program2 {
    public static void main(String[] args) {
        String name = "durgasoft software solution hyderabad";
        Function<String,String> f = s->s.replaceAll(" ","");
        System.out.println(f.apply(name));

        Function<String,Integer> f1 = s->s.length() - s.replaceAll(" ","").length();
        System.out.println(f1.apply(name));
    }
}
