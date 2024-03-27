package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalDate futureDate = LocalDate.now().plusWeeks(2);
        System.out.println("Date 2 weeks from now: " + futureDate);

        LocalDate specifiedDate = LocalDate.of(2022, 12, 31);
        int comparison = LocalDate.now().compareTo(specifiedDate);
        if (comparison < 0) {
            System.out.println("Current date is before the specified date");
        } else if (comparison > 0) {
            System.out.println("Current date is after the specified date");
        } else {
            System.out.println("Current date is equal to the specified date");
        }

        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 12, 31);
        long differenceInDays = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference in days between date1 and date2: " + differenceInDays + " days");


        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        System.out.println("aktueller Zeitpunkt: " + currentZonedDateTime.format(formatter));

        ZonedDateTime inTwoWeeks = currentZonedDateTime.plusWeeks(2);
        System.out.println("2 Wochen später: " + inTwoWeeks.format(formatter));


        System.out.println("Hello world!");
    }
}