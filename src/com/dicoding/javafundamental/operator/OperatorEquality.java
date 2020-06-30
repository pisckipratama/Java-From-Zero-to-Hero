package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        System.out.println("*** Sama dengan ***");
        int value1 = 5;
        int value2 = 4;

        boolean hasil;
        hasil = value1 == value2;

        System.out.println("Hasil '5 == 4' adalah " + hasil);
        System.out.println();

        System.out.println("*** Tidak sama dengan ***");
        hasil = value1 != value2;
        System.out.println("Hasil '5 != 4' adalah " + hasil);
        System.out.println();

        System.out.println("*** Lebih besar ***");
        hasil = value1 > value2;
        System.out.println("Hasil '5 > 4' adalah " + hasil);
        System.out.println();

        System.out.println("*** Lebih kecil ***");
        hasil = value1 < value2;
        System.out.println("Hasil '5 < 4' adalah " + hasil);
        System.out.println();

        System.out.println("*** Lebih besar sama dengan ***");
        hasil = value1 >= value2;
        System.out.println("Hasil '5 >= 4' adalah " + hasil);
        System.out.println();

        System.out.println("*** Lebih kecil sama dengan ***");
        hasil = value1 <= value2;
        System.out.println("Hasil '5 <= 4' adalah " + hasil);
    }
}
