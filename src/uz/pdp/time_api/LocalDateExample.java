package uz.pdp.time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Set;

public class LocalDateExample {
    public static void main(String[] args) {
       /* LocalDate date = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("date = " + date);
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        LocalDate localDate = date.plus(8, ChronoUnit.MONTHS);
        System.out.println("localDate = " + localDate);
        localDate=date.minus(40,ChronoUnit.DAYS);
        System.out.println("localDate = " + localDate);
        System.out.println("LocalTime.MAX = " + LocalTime.MAX);
        System.out.println("LocalTime.MIN = " + LocalTime.MIN);
        System.out.println("LocalTime.NOON = " + LocalTime.NOON);
        System.out.println("LocalTime.MIDNIGHT = " + LocalTime.MIDNIGHT);*/

       /* ZoneId zone1 = ZoneId.of("Asia/Tashkent");
        ZoneId zone2 = ZoneId.of("Canada/Pacific");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("Uzbekistan Time Zone: "+time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: "+time2);
        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Time Zone: "+hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone: "+minutes);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();*/
//        availableZoneIds.forEach(System.out::println);package

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy '=>' z");
        System.out.println("zonedDateTime.format(formatter) = " + zonedDateTime.format(formatter));
        DayOfWeek dayOfWeek=zonedDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        Month month=zonedDateTime.getMonth();
        System.out.println("month = " + month);
    }
}
