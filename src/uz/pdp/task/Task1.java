package uz.pdp.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {
//        task1(2020);
//        task2(2020);
        task3();
    }
    public static void task1(int year){
        GregorianCalendar calendar = new GregorianCalendar();
        if(calendar.isLeapYear(year)){
            System.out.println("Kabisa yili");
        }
        else {
            System.out.println("Kabisa yili emas");
        }

    }
    public static void task2(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, 1);
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (day == 29){
            System.out.println("Kabisa yili");
        }else {
            System.out.println("Kabisa yili emas");
        }
    }
    public static void task3(){
        Calendar calendar = Calendar.getInstance();
        int counter = 1;
        while (counter <= 20){
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY){
                if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
                    counter++;
                }
            }
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
