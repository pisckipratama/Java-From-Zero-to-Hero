package com.dicoding.javafundamental.studycase;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /* Contoh pemakaian IF tiga kasus : wujud air */

        /* Kamus */
        int T;

        /* Program */
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

        // Scanner untuk masukkan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        // proses pengecekan
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
