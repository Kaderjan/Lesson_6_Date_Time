package hometask;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


public class FourthList {

    public static void main(String[] args) {
        printCurrentMonth();
        printTimeZones();
        currentTImeInAllTimeZones();
    }
    static void printCurrentMonth(){
        Month month= LocalDate.now().getMonth();

        System.out.println("index num: "+month.getValue());
        System.out.println("month conti: "+month.length(LocalDate.now().isLeapYear()));
        System.out.println("month max conti: "+month.maxLength());
        System.out.println("month name: "+month.name());
    }
    static void printTimeZones(){
        String[] availableIDs = TimeZone.getAvailableIDs();

        for (String availableID : availableIDs) {
            System.out.println("availableID = " + availableID);
        }
    }

    static void currentTImeInAllTimeZones(){
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String availableID : availableIDs) {
            System.out.println(availableID+" =>  "+LocalTime.now(ZoneId.of(availableID)));
        }
    }
}
