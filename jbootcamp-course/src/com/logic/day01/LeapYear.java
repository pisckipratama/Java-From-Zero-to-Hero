package com.logic.day01;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    // masukkan int tahun lalu cek apakah tahun kabisat atau bukan
    // tahun kabisat adalah tahun yang jika dibagi 400 sisa 0
    // atau tahun yang dibagi 4 sisanya 0 dan jika dibagi 100
    // sisanya != 0

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      System.out.printf("Tahun %d adalah tahun kabisat.", year);
    } else {
      System.out.printf("Tahun %d bukan tahun kabisat.", year);
    }

    scanner.close();
  }
}
