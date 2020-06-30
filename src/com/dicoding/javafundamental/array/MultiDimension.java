package com.dicoding.javafundamental.array;

public class MultiDimension {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimensi 1 yang index 0 memiliki 2 elemen
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        // Dimensi 1 yang index 1 memiliki 3 elemen
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        // tampilkan semua data di dimensi 1 index 0
        System.out.println("arrChar[0][0] = " + arrChar[0][0]);
        System.out.println("arrChar[0][1] = " + arrChar[0][1]);

        // tampilkan semua data di dimensi 1 index 1
        System.out.println("arrChar[1][0] = " + arrChar[1][0]);
        System.out.println("arrChar[1][1] = " + arrChar[1][1]);
        System.out.println("arrChar[1][2] = " + arrChar[1][2]);
    }
}
