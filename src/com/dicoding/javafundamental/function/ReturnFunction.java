package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 9.3;
        double l = 5.6;
        double hasil = hitungLuas(p, l); // memanggil fungsi
        System.out.println("Hasilnya adalah : " + hasil);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
