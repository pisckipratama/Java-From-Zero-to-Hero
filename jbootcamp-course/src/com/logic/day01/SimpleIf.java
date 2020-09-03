package com.logic.day01;

import java.util.Scanner;

public class SimpleIf {
  public static void main(String[] args) {
    // tentukan apakah inputan bilangan genap atau bilangan ganjil
    // contoh 4 / 2 = 2, karena sisa bagi 0 maka output ganjil
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("masukkan bilangan: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("Bilangan genap");
    } else {
      System.out.println("Bilangan ganjil");
    }

    scanner.close();
    
  }
}
