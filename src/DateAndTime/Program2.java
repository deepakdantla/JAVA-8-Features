package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Program2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day+ " " + month + " " + year);
        System.out.printf("%d-%d-%d",day,month,year);
        System.out.println();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.printf("%d:%d:%d:%d",hour,min,sec,nano);
    }
}
