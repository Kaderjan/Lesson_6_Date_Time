package test;


import uz.pdp.formatting.DateTimeFormatterExample;
import uz.pdp.time_api.LocalDateExample;
import uz.pdp.time_api.PeriodDurationExample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

public class Test {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//
//        Date time = calendar.getTime();
//        System.out.println("====");
//
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println(time);
//
//        Date date = new Date();
//        calendar.add(Calendar.YEAR, 1);
//
//
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-:MM-:dd");
//
//        System.out.println(dateFormat.format(date));
//        try {
//            Date parse = dateFormat.parse("2002-:12-:11");
//
//            System.out.println(parse);
//        } catch (ParseException e) {
//            System.out.println(e);
//        }
//
//        DateFormat dateFormat1=new SimpleDateFormat("'hii'yyyy:'second'MM:'socnd'dd");
//
//        System.out.println(dateFormat1.format(date));

        LocalDate localDate=LocalDate.now();

      //  System.out.println(localDate);

      //  System.out.println(localDate.getYear());
//        System.out.print(localDate.getDayOfWeek()+", ");
//        System.out.print(localDate.getDayOfMonth()+" ");
//        System.out.println(localDate.getMonth());
//
//        System.out.print(localDate.getMonth()+" "+localDate.getYear());
//
//       // System.out.println(localDate.getMonthValue());
//
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println();
//        System.out.println(localDateTime.getDayOfMonth());
//
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM//dd//yyyy");
//        LocalDateTime localDateTime1=LocalDateTime.now()
//        System.out.println(localDateTime1.format(formatter));
//
//        System.out.println(localDateTime1);


        TemporalAdjuster temporalAdjuster = TemporalAdjusters.lastDayOfMonth();


        ZoneId zoneId=ZoneId.of("Asia/Tashkent");

       // System.out.println(zoneId);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM','yyyy");

      //  LocalDate localDate1=LocalDate.now();

       // System.out.println(localDate1.format(formatter));
        System.out.println(localDate+"  ------------ ");
        System.out.println();
        System.out.print(localDate.getDayOfWeek()+", ");
        System.out.println(localDate.getDayOfMonth()+" "+localDate.getMonth());
        System.out.println(localDate.getMonth()+" "+localDate.getYear());


        //DayOfWeek dayOfWeek = localDate1.getDayOfWeek();
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.print(value.toString().substring(0, 2)+" \t");
        }

        System.out.println();
        TemporalAdjuster adjuster=TemporalAdjusters.firstDayOfMonth();
        int ordinal=localDate.with(adjuster).getDayOfWeek().ordinal();
        int monthValue =localDate.lengthOfMonth();
        for (int i = 0; i < ordinal; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= monthValue; i++) {
            System.out.print(i+"\t");
            if((ordinal+i)%7==0)
                System.out.println();
        }
    }
}
