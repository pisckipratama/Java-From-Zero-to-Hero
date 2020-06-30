package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nyoba {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        String pekerjaan = "";
        try {
            System.out.print("Nama pekerjaan: ");
            pekerjaan = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pekerjaan kamu adalah: " + pekerjaan);
    }
}
