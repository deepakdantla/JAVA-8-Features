package com.deepak.java8features.consumer;

import java.util.function.Consumer;

class Movie2{
    String name;
    String result;

    public Movie2(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Consumer<Movie2> c1 = m-> System.out.println("Movie: " + m.name + "is ready to release");

        Consumer<Movie2> c2 = m-> System.out.println("Movie: " + m.name +
                "is ready to released and the result is " + m.result);

        Consumer<Movie2> c3 = m-> System.out.println("Movie: " + m.name + "is stored in the db");

        Movie2 m = new Movie2("Bhahubali","Hit");

        Consumer<Movie2> ChainingC = c1.andThen(c2).andThen(c3);
        ChainingC.accept(m);
    }
}
