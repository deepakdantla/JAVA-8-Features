package com.deepak.java8features.function;


import java.util.Scanner;
import java.util.function.Function;

public class Program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String user = sc.next();

        System.out.println("enter pwd");
        String pwd = sc.next();

        Function<String,String> f1 = s->s.substring(0,6);
        Function<String,String> f2 = s->s.toLowerCase();

        if(f1.andThen(f2).apply(user).equals("deepak") && pwd.equals("java")){
            System.out.println("Valid User");
        }else
            System.out.println("Invalid User");
    }
}
