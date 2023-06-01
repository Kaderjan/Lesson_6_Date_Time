package hometask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {

        kabisaWithCalendar(2002);
        findDayAfterNDays(LocalDate.now(),20);

        findWorkingDaysOfYear(2023);
        System.out.println("=as");
        findznthOfFriday(2023,2);

        Date date=new Date();
    }


    static void kabisaWithCalendar(int year){
        GregorianCalendar calendar=new GregorianCalendar();
        if (calendar.isLeapYear(year))
            System.out.println(year+" is a kabisa year");
        else
         System.out.println(year+" is not a kabisa year");


    }

    static void findDayAfterNDays(LocalDate localDate,int nDay){
        int temp=0;
        while (temp<nDay){
            if(localDate.getDayOfWeek().ordinal()!=5&&localDate.getDayOfWeek().ordinal()!=6)
                temp++;

            localDate=localDate.plusDays(1);
        }

        System.out.println(localDate);
    }

    static void findWorkingDaysOfYear(int year){
        LocalDate localDate=LocalDate.of(year,1,1);

        int count=0;
        int fullDays=365;
        if(localDate.isLeapYear())
            fullDays=366;

        int temp=0;
        while (temp<fullDays){
            if(localDate.getDayOfWeek().ordinal()==5||localDate.getDayOfWeek().ordinal()==6)
                count++;
            localDate=localDate.plusDays(1);
            temp++;
        }

        System.out.println(count+" ta leisure days ");
    }

    static void findznthOfFriday(int year, int index){
        LocalDate localDate=LocalDate.of(year,1,1);
        System.out.println("localDate.getMonth() = " + localDate.getMonth());

        while (true){
            if(localDate.getDayOfWeek().ordinal()==4)
                break;
            localDate=localDate.plusDays(1);
        }

        localDate=localDate.plusDays(7L *(index-1));

        String  res=localDate.getYear()+" "+localDate.getMonth()+" "+localDate.getDayOfMonth()+" " +
                " "+localDate.getDayOfWeek();
        System.out.println(index+" th friday of the year "+year+" is "+res);
;

//        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
//
//        System.out.println();
//        System.out.println("---------------------------");
//        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
//        System.out.println("localDate.getMonth() = " + localDate.getMonth());
//        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());

    }

    // calculate leisure days of the yea

}
