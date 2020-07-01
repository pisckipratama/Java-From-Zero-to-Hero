package com.dicoding.javafundamental.tanggaldanwaktu;

import java.util.Calendar;

public class ExplicitSpesipicCalendar {
    public static void main(String[] args) {
        // sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Sekarang: " + calendar.getTime());

        // 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yg lalu " + calendar.getTime());

        // 4 bulan yg akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan yg akan datang" + calendar.getTime());

        // 2 tahun yg akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun yg akan datang " + calendar.getTime());
    }
}
