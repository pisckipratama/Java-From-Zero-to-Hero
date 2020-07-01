package com.dicoding.javafundamental.tanggaldanwaktu;

import java.util.Calendar;

public class ExplicitSplitCalendar {
    public static void main(String[] args) {
        // menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah: " + calendar.getTime());

        // menampilkan spesifik
        System.out.println("Tanggal\t: " + calendar.get(Calendar.DATE));
        System.out.println("Bulan\t: " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun\t: " + calendar.get(Calendar.YEAR));
    }
}
