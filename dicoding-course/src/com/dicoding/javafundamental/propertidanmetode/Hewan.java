package com.dicoding.javafundamental.propertidanmetode;

public class Hewan {
    // properti atau fields
    // inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // inisiasi melalui konstruktor
    int umur;

    // konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    // tanpa nilai balik
    void lari() {
        System.out.println("Berlari dengan sangat cepat...");
    }

    void jalan() {
        System.out.println("Berjalan dengan santai..");
    }

    void makan() {
        System.out.println("Makannya banyak...");
    }

    // dengan nilai balik
    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}
