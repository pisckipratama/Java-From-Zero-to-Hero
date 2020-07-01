package com.dicoding.javafundamental.tanggaldanwaktu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default: " + new Date());
        System.out.println("Format tanggal terformat: " + dateFormated);
    }
}
