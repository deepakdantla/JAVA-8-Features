package DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Program6 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        System.out.println();

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);

        System.out.println(zt);
    }
}
