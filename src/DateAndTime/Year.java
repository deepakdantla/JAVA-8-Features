package DateAndTime;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();

        java.time.Year y = java.time.Year.of(n);
        if(y.isLeap())
            System.out.println("the year is a leap year");
        else
            System.out.println("The year is not a leap year");

    }
}
