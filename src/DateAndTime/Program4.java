package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Program4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1995, Month.MAY,28,8,45);
        System.out.println(dt);

        System.out.println("After six months: " + dt.plusMonths(6));
        System.out.println("Before six months: " + dt.minusMonths(6));
    }
}
