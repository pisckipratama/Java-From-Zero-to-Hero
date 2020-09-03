package com.dicoding.javafundamental.propertidanmetode;

public class Main {
    public static void main(String[] args) {
        // kita tambahkan 1 argumen dengan nilai int 2
        // nilai tersebut adalah nilai yang digunakan untuk inisiasi variable umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        // contoh penggunaan fungsi getUmur()
        System.out.println("Umurnya adalah: " + kucing.getUmur());

        // Perhitungan indeks masa tubuh (BMI)
        // berat (kg) / (tinggi(m) * tinggi(m))
        double bmi = kucing.getBerat() / ((kucing.getTinggi() / 100) * (kucing.getTinggi() / 100));
        System.out.println("Indeks massa tubuhnya adalah: " + bmi);
    }
}
