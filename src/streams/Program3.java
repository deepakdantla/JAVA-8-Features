package streams;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(15);
        l.add(25);

        Integer[] array = l.stream().toArray(Integer[] :: new);
        for(Integer x:array){
            System.out.println(x);
        }
    }
}
