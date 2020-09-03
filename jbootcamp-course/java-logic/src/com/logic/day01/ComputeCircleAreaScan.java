package com.logic.day01;

import java.util.Scanner;

public interface ComputeCircleAreaScan {
  public static void main(String[] args) {
    final double pi = 3.14159;
    Scanner scanner = new Scanner(System.in);

    // define user input
    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();

    // compute area
    double area = radius * radius * pi;
    
    // display circle area
    System.out.printf("Luas lingkaran dengan radius %.0f = %.2f", radius, area);

    // close scanner
    scanner.close();
  }
}