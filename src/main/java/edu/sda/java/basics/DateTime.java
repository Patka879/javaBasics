package edu.sda.java.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.plusDays(2).getDayOfWeek()); // adding days to current days
        System.out.println(localDate.plusDays(-2).getDayOfWeek()); // subtracting days from current day
        LocalDateTime newDateTime = LocalDateTime.of(2013, 7, 13, 2, 24);
        System.out.print(newDateTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.print(localDateTime.atZone(ZoneId.of("America/Chicago")));
    }

}
