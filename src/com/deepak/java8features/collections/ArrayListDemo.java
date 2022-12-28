package com.deepak.java8features.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        arrayList.add(2,26);
        System.out.println("After adding the new element:");
        System.out.println(arrayList);

    }
}
