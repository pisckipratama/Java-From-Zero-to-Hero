package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;

public class ifThenElseifThenElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian Anda: ");
        int nilaiUjian = scanner.nextInt();
        char IPK;

        if (nilaiUjian >= 90) {
            IPK = 'A';
        } else if (nilaiUjian >= 80) {
            IPK = 'B';
        } else if (nilaiUjian >= 70) {
            IPK = 'C';
        } else if (nilaiUjian >= 60) {
            IPK = 'D';
        } else if (nilaiUjian >= 50) {
            IPK = 'E';
        } else {
            IPK = 'F';
        }

        System.out.println("Nilai ujian akhir anda adalah " + IPK);
    }
}
