import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        isKabisa(2003);
        isKabisa2(2003);

     afterSomeDays(LocalDate.now(),20);
    }
    static void isKabisa(int year){
        GregorianCalendar calendar=new GregorianCalendar();
        if(calendar.isLeapYear(year))
            System.out.println("kabisa year");
        else System.out.println("not kabisa year");

    }
    static void isKabisa2(int year){

        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,1);

        if (calendar.getActualMaximum(Calendar.DAY_OF_MONTH)==29)
            System.out.println("kabisa year");
        else System.out.println("not kabisa year");
    }

    static void afterSomeDays(LocalDate localDate,int day){
        Calendar calendar=Calendar.getInstance();
        int count=day;
        while (count>=0){
            if(calendar.get(Calendar.DAY_OF_WEEK)!=Calendar.SATURDAY&&calendar.get(Calendar.DAY_OF_MONTH)!=Calendar.SUNDAY)
                count--;
            calendar.add(Calendar.DAY_OF_WEEK,1);
        }

        DateFormat dateFormat=new SimpleDateFormat("yyyy:MM:dd");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}