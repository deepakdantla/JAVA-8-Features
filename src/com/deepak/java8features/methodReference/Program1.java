package com.deepak.java8features.methodReference;

interface Interf{
    public void m1();
}
public class Program1 {
    public static void m2(){
        System.out.println("Method Reference");
    }
    public static void main(String[] args) {
        Interf i = Program1::m2;
        i.m1();
    }
}
