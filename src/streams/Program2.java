package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Pavan");
        l.add("Raviteja");
        l.add("Chiranjeevi");
        l.add("Venkatesh");
        l.add("Nagarjuna");
        System.out.println(l);
        List<String> l1 = l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println(l1);
        List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);

        long count = l.stream().filter(s->s.length()>=9).count();
        System.out.println(count);
        System.out.println("******************************************");

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(0);
        l3.add(10);
        l3.add(20);
        l3.add(5);
        l3.add(15);
        l3.add(25);

        List<Integer> l4 = l3.stream().sorted().collect(Collectors.toList());
        System.out.println(l4);

        List<Integer> l5 = l3.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l5);

        System.out.println("*********************");

        Integer min = l3.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Min value is: " + min);

        Integer max = l3.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Max value is: " + max);

        System.out.println("********************************");
        ArrayList<String> l6 = new ArrayList<>();
        l6.add("A"); l6.add("BB"); l6.add("CCC");

        l6.stream().forEach(s-> System.out.println(s));
        l6.stream().forEach(System.out::println);
    }
}
