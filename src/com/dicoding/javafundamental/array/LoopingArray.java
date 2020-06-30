package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i + 1;
            System.out.println(arrInt[i]);
        }
    }
}
