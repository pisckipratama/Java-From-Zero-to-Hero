package com.logic.day01;

import java.util.Scanner;

public class TabakHari {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number between 1 - 7: ");
    int day = scanner.nextInt();

    switch (day) {
      case 1:
        System.out.println("Minggu");
        break;
      case 2:
        System.out.println("Senin");
        break;
      case 3:
        System.out.println("Selasa");
        break;
      case 4:
        System.out.println("Rabu");
        break;
      case 5:
        System.out.println("Kamis");
        break;
      case 6:
        System.out.println("Jumat");
        break;
      case 7:
        System.out.println("Sabtu");
        break;
      default:
        System.out.println("Invalid Day");
        break;
    }

    scanner.close();
  }
}
