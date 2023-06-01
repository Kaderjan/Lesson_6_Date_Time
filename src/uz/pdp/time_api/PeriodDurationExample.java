package uz.pdp.time_api;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDurationExample {
    public static void main(String[] args) {
        LocalDate localDate1=LocalDate.of(2020,03,25);
        LocalDate localDate2=LocalDate.now();
        Period period=Period.between(localDate1,localDate2);
        System.out.println("period = " + period);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.get(ChronoUnit.MONTHS) = " + period.get(ChronoUnit.MONTHS));
        System.out.println("period.get(ChronoUnit.DAYS) = " + period.get(ChronoUnit.DAYS));
        LocalTime localTime1=LocalTime.of(2,45,50);
        LocalTime localTime2=LocalTime.now();

        Duration duration =Duration.between(localTime1,localTime2);
        System.out.println("duration.get(ChronoUnit.HOURS) = " + duration.getSeconds());

    }
}
