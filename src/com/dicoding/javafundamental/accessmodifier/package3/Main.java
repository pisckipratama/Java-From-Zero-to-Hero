package com.dicoding.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Arithmatic.nilai);

        for (int i = 0; i < 5; i++) {
            new Arithmatic();
        }

        System.out.println("Sampai " + Arithmatic.nilai);

        System.out.println("getNilai memiliki nilai " + Arithmatic.getNilai());
    }
}
