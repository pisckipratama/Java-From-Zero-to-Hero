package com.dicoding.javafundamental.operator;

public class OperasiAritmatika {
    public static void main(String[] args) {
        System.out.println("*** Operasi Penjumlahan ***");
        int hasilPenjumlahan = 5 + 1;
        System.out.println("Hasil Penjumlahan 5 + 1 = " + hasilPenjumlahan);
        System.out.println();

        System.out.println("*** Operasi Pengurangan ***");
        int hasilPengurangan = 4 - 1;
        System.out.println("Hasil pengurangan 4 - 1 = " + hasilPengurangan);
        System.out.println();

        System.out.println("*** Operasi Perkalian ***");
        int hasilPerkalian = 5 * 5;
        System.out.println("Hasil perkalian 5 * 5 = " + hasilPerkalian);
        System.out.println();

        System.out.println("*** Operasi Pembagian ***");
        int hasilPembagian = 20 / 2;
        System.out.println("Hasil pembagian 20 / 2 = " + hasilPembagian);
        double hasilPembagian2 = Double.parseDouble("15") / Double.parseDouble("2");
        System.out.println("Hasil pembagian 15 / 2 = " + hasilPembagian2);
        System.out.println();

        System.out.println("*** Operasi Hasil Sisa ***");
        int hasilSisa = 8 % 2;
        System.out.println("Hasil pembagian 8 % 2 = " + hasilSisa);
        int hasilSisa2 = 9 % 2;
        System.out.println("Hasil pembagian 9 % 2 = " + hasilSisa2);
    }
}
