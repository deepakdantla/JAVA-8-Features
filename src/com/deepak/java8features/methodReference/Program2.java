package com.deepak.java8features.methodReference;

class Sample{
    Sample(){
        System.out.println("Sample constructor execution and object creation");
    }
}

interface Interf1{
    public Sample get();
}
public class Program2 {

    public static void main(String[] args) {
        Interf1 i = Sample::new;
        Sample s = i.get();

    }

}
