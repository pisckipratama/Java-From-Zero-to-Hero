package com.dicoding.javafundamental.accessmodifier.package1;

public class KelasA {
    private int memberA = 5;

    char memberB = 'A'; // default
    double memberC = 1.6; // default

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC() {
        System.out.println("Percobaan access modifier protected!");
    }
}
