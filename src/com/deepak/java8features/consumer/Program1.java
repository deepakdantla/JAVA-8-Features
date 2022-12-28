package com.deepak.java8features.consumer;

import java.util.function.Consumer;

public class Program1 {

    public static void main(String[] args) {
        Consumer<String> c = s->{
            System.out.println(s);
        };

        c.accept("Deepak");
        c.accept("Barath");
    }
}
