package uz.pdp.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat dateFormat= new SimpleDateFormat("'Sana=>'dd.MM.yyyy   'Vaqt=>' hh:mm:ss");
        System.out.println("dateFormat.format(date) = " + dateFormat.format(date));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String stringDate="2023.13.20";
        try {
            Date date1=simpleDateFormat.parse(stringDate);
            System.out.println(date1);
        } catch (ParseException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }


    }
}
