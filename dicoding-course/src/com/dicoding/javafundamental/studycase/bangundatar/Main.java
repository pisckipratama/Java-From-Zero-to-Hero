package com.dicoding.javafundamental.studycase.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Kamus

        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        // program
        mainMenu();
        switch (pilihan) {
            case '1':
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1, s2));
                break;
            case '2':
                System.out.print("Masukkan panjang: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga siku: " + osegitiga.luas(s1, s2));
                System.out.println("Keliling segitiga siku: " + osegitiga.keliling(s1, s2));
                break;
            case '3':
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            default:
                System.out.println("Pilihan tidak ada!");
                break;
        }
    }

    private static void mainMenu() {
        // pilihan meni
        System.out.println("==========");
        System.out.println("Hitung Luas dan Keliling: ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
