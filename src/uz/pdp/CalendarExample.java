package uz.pdp;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
//        Calendar
//        Date
        Calendar calendar=Calendar.getInstance();
//        Calendar calendar= new GregorianCalendar();
        System.out.println(calendar);

        System.out.println("calendar.get(Calendar.ERA) = " + calendar.get(Calendar.ERA));
        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));
        System.out.println("calendar.get(Calendar.MONTH) = " + calendar.get(Calendar.MONTH));
        System.out.println("calendar.get(Calendar.DATE) = " + calendar.get(Calendar.DATE));
        System.out.println("calendar.getTime() = " + calendar.getTime());
        System.out.println("calendar.get(Calendar.DAY_OF_WEEK) = " + calendar.get(Calendar.DAY_OF_WEEK));
        calendar.set(Calendar.YEAR,2022);
        System.out.println("calendar.get(Calendar.DAY_OF_WEEK) = " + calendar.get(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.YEAR,10);
        System.out.println("calendar.get(Calendar.DAY_OF_WEEK) = " + calendar.get(Calendar.DAY_OF_WEEK));

        Date date=new Date();
        Date date2=new Date(2023,5,20);
        Date date1=calendar.getTime();
        System.out.println(date);


    }
}
