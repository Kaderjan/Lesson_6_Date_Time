package uz.pdp.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("localDate.format(timeFormatter) = " + localDate.format(timeFormatter));
        LocalDate localDate1=LocalDate.parse("20/05/2020",timeFormatter);
        System.out.println("localDate1 = " + localDate1);
    }
}
