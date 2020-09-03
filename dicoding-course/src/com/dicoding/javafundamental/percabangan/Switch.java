package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan input: ");

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Amazing!");
                break;
            case 2:
                System.out.println("Boom!");
                break;
            case 3:
                System.out.println("Coookie!");
                break;
            case 4:
                System.out.println("Damn!");
                break;
            case 5:
                System.out.println("Edunn!");
                break;
            default:
                System.out.println("Good!");
                break;
        }
    }
}
