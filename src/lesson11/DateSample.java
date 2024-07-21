package lesson11;

import java.time.LocalDate;
import java.time.Month;

public class DateSample {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2019, 8, 25);
        System.out.println(ld);
        ld = LocalDate.of(2023, Month.APRIL, 1);
        System.out.println(ld);
    }

}