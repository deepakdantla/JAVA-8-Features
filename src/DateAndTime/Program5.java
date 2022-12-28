package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Program5 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998, Month.JANUARY,26);
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthday,today);
        System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());

        LocalDate deathday = LocalDate.of(1998+60, Month.JANUARY,26);
        Period p1 = Period.between(today,deathday);

        System.out.printf("\nOnly %d years of life remaining for you", p1.getYears());
    }
}
