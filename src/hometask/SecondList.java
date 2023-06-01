package hometask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SecondList {

    public static void main(String[] args) {
     first();
     second();
     third();
     fourth();
     fifth();
     sixth();
     seventh();
     eighth();
     ninth();
     tenth();
    }

    static void first(){
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        String time=dateTime.format(formatter);
        String  day=dateTime.getDayOfWeek().toString().substring(0,3);
        DateTimeFormatter monthDayFormatter=DateTimeFormatter.ofPattern("MM ' ' dd");
        String  month=dateTime.getMonth().toString().substring(0,3);
        int year = dateTime.getYear();
        System.out.println(day+" "+month+" "+dateTime.getMonthValue()+" "+time+" "+year);
    }
   static void second(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();

        DateTimeFormatter yearFormatter=DateTimeFormatter.ofPattern("dd/M/yy");
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("h:mm 'PM'");

       System.out.println(dateTime.format(yearFormatter)+" "+dateTime.format(timeFormatter));
   }
   static void third(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("hh:mm:ss 'PM'");

       System.out.println(dateTime.format(timeFormatter));
   }
   static void fourth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("hh:mm:ss 'PM'");

        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd ','yyyy");
       String month=dateTime.getMonth().toString();
       System.out.println(month+" "+dateTime.format(dateFormatter)+"  "+dateTime.format(timeFormatter));

       // universal formatter
       DateTimeFormatter universalFormat=DateTimeFormatter.ofPattern("dd', 'yyyy  hh:mm:ss 'PM'");

       System.out.println(month+" "+dateTime.format(universalFormat));
   }
   static void fifth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("h:mm 'PM'");

       System.out.println(dateTime.format(timeFormatter));
   }
   static void sixth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("hh:mm:ss 'PM'");

       System.out.println(dateTime.format(timeFormatter));
   }
   static void seventh(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("E  hh:mm:ss 'PM'");

       System.out.println(dateTime.format(timeFormatter));
   }
   static void eighth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("dd/M/yy h:mm a");

       System.out.println(dateTime.format(timeFormatter));
   }
   static void ninth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern(" d', 'yyyy  h:mm a");
      String month =dateTime.getMonth().toString();
       System.out.println(month+" "+dateTime.format(timeFormatter));
   }
   static void tenth(){
       System.out.println();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern(" d',' yyyy h:mm:ss a");
      String month =dateTime.getMonth().toString();
       System.out.println(month+" "+dateTime.format(timeFormatter));
   }

}
