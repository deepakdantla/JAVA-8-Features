package com.deepak.java8features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortWithoutLambda {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        System.out.println("Before sorting: " + l);
        Collections.sort(l);
        System.out.println("After sorting: " + l);
    }
}
