package com.dicoding.javafundamental.studycase;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        /* Kamus */
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /* Program */
        // masukkan kalimat
        System.out.print("Masukkan Kalimat: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        // memanggil method
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " + vokal);
        System.out.println("Jumlah huruf konsonan : " + konsonan);
    }

    public static int num_vokal(String word) {
        word = word.toLowerCase();
        int i;
        int jumlahVokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlahVokal++;
            }
        }

        return jumlahVokal;
    }

    public static int num_konsonan(String word) {
        word = word.toLowerCase();
        int i;
        int jumlahKonsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlahKonsonan++;
            }
        }

        return jumlahKonsonan;
    }
}
