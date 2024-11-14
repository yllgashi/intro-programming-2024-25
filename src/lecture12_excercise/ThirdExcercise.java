package lecture12_excercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class ThirdExcercise {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now(); // highly recommended to use
        GregorianCalendar gregorianCalendar = new GregorianCalendar();


        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(gregorianCalendar.getTime());


        // Information of dateTime
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
    }
}
