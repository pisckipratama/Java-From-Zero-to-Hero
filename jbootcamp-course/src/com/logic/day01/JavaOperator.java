package com.logic.day01;

public class JavaOperator {
  public static void main(String[] args) {
    // aritmathic operator
    int x = 5, y = 3, z = 2;
    double a = (x + y) / z;
    double b = x + y / z;
    double c = x + (y * 2) / z;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    // assignment operator
    x += 5; // x = x + 5
    System.out.println("x = " + x);

    // increment decrement
    x++;
    System.out.println("x increment " + x);

    x--;
    System.out.println("x decrement " + x);
  }
}