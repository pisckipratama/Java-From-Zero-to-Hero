package com.dicoding.javafundamental.exception;

public class FinnalyExcept {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            System.out.println("Akses element 5: " + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai element akhir: " + a[4]);
        }
    }
}
