package com.logic.day01;

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int angka1 = (int)(Math.random() * 10);
    int angka2 = (int)(Math.random() * 10);

    if (angka1 < angka2) {
      int temp = angka1;
      angka1 = angka2;
      angka2 = temp;
    }

    System.out.println("Berapa " + angka1 + " - " + angka2 + " = ?");
    System.out.print("Jawab: ");
    int hasil = scanner.nextInt();
    if (angka1 - angka2 == hasil) {
      System.out.println("Selamat anda Benar!");
    } else {
      System.out.println("Belajar lagi skuy!");
    }

    scanner.close();
  }
}
