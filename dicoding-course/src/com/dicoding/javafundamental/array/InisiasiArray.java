package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        // cara kesatu
        int[] arrInt = new int[]{1, 2, 3, 4, 5};
        System.out.println(arrInt[2]);

        // cara kedua
        int[] arrInt2 = new int[4];
        arrInt2[3] = 2;
        arrInt2[0] = 1;
        arrInt2[2] = 3;
        arrInt2[1] = 4;

        System.out.println(arrInt2[0]);

        // cara ketiga
        int[] arrInt3 = {1, 2, 3, 4, 5, 6};
        System.out.println(arrInt3[3]);

        // nyobain
        String[] arrStr = {"Bandung", "Depok", "Bogor", "Sumedang"};
        System.out.println(arrStr[2]);
    }
}
