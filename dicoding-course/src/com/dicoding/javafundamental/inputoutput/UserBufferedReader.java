package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(isr);
        System.out.println("*** Penjumlahan sangat sederhana ***");
        int value1 = 0;
        int value2 = 0;

        try {
            System.out.print("Masukkan angka pertama: ");
            value1 = Integer.parseInt(bufferReader.readLine());
            System.out.print("Masukkan angka kedua: ");
            value2 = Integer.parseInt(bufferReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = value1 + value2;
        System.out.println("Hasil: " + hasil);
    }
}
