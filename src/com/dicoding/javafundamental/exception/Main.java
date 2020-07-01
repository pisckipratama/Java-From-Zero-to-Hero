package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Mencoba membaca berkas
            String location = "/home/pratama/hehe.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file.toString());
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
