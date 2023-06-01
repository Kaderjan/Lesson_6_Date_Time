package uz.pdp.time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {
    public static void main(String[] args) {
        LocalDateTime localDate= LocalDateTime.now();
//        LocalDate fistDayOfMonth=localDate.with(TemporalAdjusters.firstDayOfMonth());
//        System.out.println(fistDayOfMonth);
        LocalDateTime localDate1=localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        printCalendar(localDate1);
    }

    static void printCalendar(LocalDateTime localDateTime){

        LocalTime localTime=localDateTime.toLocalTime();

        System.out.println("localTime = " + localTime);

        LocalDate localDate=localDateTime.toLocalDate();

        System.out.println("localDate = " + localDate);

        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        Month month=localDate.getMonth();
        DateTimeFormatter dayYear=DateTimeFormatter.ofPattern("dd','yyyy");


        String dayYearStr=localDate.format(dayYear);


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
        String timeStr=localTime.format(formatter);
        System.out.println(timeStr);
        printDayYear(dayOfWeek,month,dayYearStr);
        System.out.print(month+" ");
        System.out.println(localDate.getYear());

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.print(value.name().substring(0,2)+"\t");
        }
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();

        LocalDate localDate1=localDate.with(temporalAdjuster);
        int ordinal = localDate1.getDayOfWeek().ordinal();

        System.out.println();
        for (int i = 0; i < ordinal; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= localDate.lengthOfMonth(); i++) {

            System.out.print(i+"\t");
            if((i+ordinal)%7==0)
                System.out.println();
        }
    }
    static void printDayYear(DayOfWeek dayOfWeek,Month month,String dayYearStr){
        System.out.println(dayOfWeek+","+month+","+dayYearStr);
    }
}
