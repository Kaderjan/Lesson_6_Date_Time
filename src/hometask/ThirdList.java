package hometask;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ThirdList {


    public static void main(String[] args) {
        timeWithoutDate();
        differenceBetweenDates();
        calculateAge();
        monthsLeft();
        beforeAfterSunday();
        printCurrentYear();
    }

    static void timeWithoutDate(){
        LocalDateTime dateTime=LocalDateTime.now();

        DateTimeFormatter onlyDate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter onlyTime=DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter whichTouse=onlyTime;
        Random random=new Random();
        if(random.nextBoolean())
            whichTouse=onlyDate;

        System.out.println(dateTime.format(whichTouse));
    }

    static void differenceBetweenDates(){
        LocalDate dateFirst=LocalDate.now();
        LocalDate dateSecond=dateFirst.plusYears(10);
        dateSecond=dateSecond.plusWeeks(12);
        Period period=Period.between(dateFirst,dateSecond);

        System.out.println("period.getDays() = " + period.getDays());
        System.out.println("period.getYears() = " + period.getYears());

//        TemporalUnit unit=(TemporalUnit)ChronoUnit.SECONDS;
//
//        System.out.println("period.get(unit) = " + period.get(unit));


   //    Duration duration=Duration.between(dateFirst,dateSecond);
//
//        long seconds = duration.getSeconds();
//        long millis = duration.toMillis();
//
//        long hours = duration.toHours();
//        System.out.println("seconds = " + seconds);
//        System.out.println("millis = " + millis);
//        System.out.println("hours = " + hours);
    }

    static void calculateAge(){
        Date date=new Date();
        System.out.println("date = " + date);
    }


    static void monthsLeft(){
        LocalDate localDate=LocalDate.now();

        LocalDate localDate1=LocalDate.of(localDate.getYear(),1,1);

        Period period=Period.between(localDate1.plusYears(1),localDate);

        System.out.println("period.getMonths() = " + period.getMonths());


    }

    static void beforeAfterSunday(){
        LocalDate localDate=LocalDate.now();
        localDate=localDate.plusDays(2);
       if(localDate.getDayOfWeek().getValue()==7){
           System.out.println("next: "+localDate.plusDays(7));
           System.out.println("previous: "+localDate.minusDays(7));
           return;
       }

        while (localDate.getDayOfWeek().getValue() != 7) {
            localDate = localDate.plusDays(1);
        }

        System.out.println("next sunday: "+localDate);

        System.out.println("previos sunday: "+localDate.minusDays(7));
    }

    static void printCurrentYear(){
        LocalDate localDate=LocalDate.now();

        System.out.println("current year : "+localDate.getYear());
        System.out.println("kabisa year  : "+localDate.isLeapYear());
        System.out.println("year  conti  : "+localDate.lengthOfYear());
    }
}
