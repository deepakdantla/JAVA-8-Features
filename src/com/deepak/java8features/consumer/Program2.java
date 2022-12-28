package com.deepak.java8features.consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<>();
        populate(l);

        Consumer<Movie> c = m->{
            System.out.println("Movie name:" + m.name);
            System.out.println("Movie hero:" + m.hero);
            System.out.println("Movie heroine:" + m.heroine);
            System.out.println("--------------");
        };

        for(Movie m : l){
            c.accept(m);
        }
    }

    private static void populate(ArrayList<Movie> l) {
        l.add(new Movie("Bahubali","Prabhas","Anushka"));
        l.add(new Movie("Rayees","Sharukh","Sunny"));
        l.add(new Movie("Dhangal","Ameer","Reetu"));
        l.add(new Movie("Sultan","Salman","Anushka"));
    }
}
