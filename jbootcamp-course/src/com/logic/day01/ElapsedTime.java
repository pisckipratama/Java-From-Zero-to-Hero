package com.logic.day01;

import java.util.Scanner;

public class ElapsedTime {
  public static void main(String[] args) {
    // convertion integer to day, hours, minutes, and seconds.
    // example 1000000 output 11 days 13 hours 46 minutes 40 seconds.
    Scanner scanner = new Scanner(System.in);

    int number, sisa;
    int hari, jam, menit, detik;

    System.out.print("Enter bilangan integer: ");
    number = scanner.nextInt();

    hari = number / 86400;
    sisa = number % 86400;

    jam = sisa / 3600;
    sisa = sisa % 3600;

    menit = sisa / 60;

    detik = sisa % 60;

    System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik ");

    scanner.close();
  }
}