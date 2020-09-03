package com.logic.day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SimpleLocalDateTime {
  public static void main(String[] args) {
    // use localdate & localdatetime
    Scanner scanner = new Scanner(System.in);

    LocalDate nowDate = LocalDate.now();
    LocalDate myDate = LocalDate.of(2020, 7, 3);

    System.out.println("current date: " + nowDate);
    System.out.println("my date: " + myDate + "\n");

    // using scanner
    System.out.print("inpute date [dd mm yyyy]: ");
    int day = scanner.nextInt();
    int month = scanner.nextInt();
    int year = scanner.nextInt();

    LocalDate scanDate = LocalDate.of(year, month, day);
    System.out.println("scandate: " + scanDate + "\n");
    
    // cari selisih between date
    LocalDate startDate = LocalDate.of(1999, 2, 24);
    LocalDate endDate = LocalDate.now();

    long years = ChronoUnit.YEARS.between(startDate, endDate);
    System.out.println("Year between: " + years);

    long moths = ChronoUnit.MONTHS.between(startDate, endDate);
    System.out.println("Month between: " + moths);

    long days = ChronoUnit.DAYS.between(startDate, endDate);
    System.out.println("Days between: " + days);

    // localdatetime
    LocalDateTime startTime = LocalDateTime.of(2020, 8, 31, 8, 30, 35);
    LocalDateTime endTime = LocalDateTime.of(2020, 9, 3, 12, 30, 35);

    long hours = ChronoUnit.HOURS.between(startTime, endTime);
    System.out.println("hours between : " + hours);

    long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
    System.out.println("minutes between : " + minutes);

    long seconds = ChronoUnit.SECONDS.between(startTime, endTime);
    System.out.println("seconds between : " + seconds);

    long millis = ChronoUnit.MILLIS.between(startTime, endTime);
    System.out.println("millis between : " + millis);

    long nanos = ChronoUnit.NANOS.between(startTime, endTime);
    System.out.println("nanos between : " + nanos);

    scanner.close();
  }
}
