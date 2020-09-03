package com.logic.day01;


public class ComputeCircleArea {
  public static void main(String[] args) {
    double radius = 10, area;
    final double pi = 3.1459;

    area = radius * radius * pi;
    System.out.println("Luas lingkaran = " + area);
    System.out.printf("Luas lingkaran = %.2f", area);
  }
}