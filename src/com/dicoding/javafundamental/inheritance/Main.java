package com.dicoding.javafundamental.inheritance;


public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals(); // memanggil konstruktor
        System.out.println("apakah animals IS-A Object -> " + (animals instanceof Object));
        System.out.println("apakah animals IS-A Animal -> " + (animals instanceof Animals));
        System.out.println("apakah animals IS-A Kucing -> " + (animals instanceof Cats));

        System.out.println("------------------------");
        Cats cats = new Cats(); // memanggil konstruktor
        System.out.println("apakah cats IS-A Object -> " + (cats instanceof Object));
        System.out.println("apakah cats IS-A Animal -> " + (cats instanceof Animals));
        System.out.println("apakah cats IS-A Kucing -> " + (cats instanceof Cats));

        System.out.println("------------------------");
        animals.makan();
        cats.makan();
        cats.makan("Wiskas");

        System.out.println("------------------------");
        Cats meow = new Cats("Ocicat", "tropis");
        Cats puss = new Cats("Ocicat", "subtropis");
        Cats popo = new Cats("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss? " + meow.equals(puss));
        System.out.println("meow equals popo? " + meow.equals(popo));

        System.out.println("------------------------");
        Object o = new Cats();
        Animals a = new Animals();
        Cats c = new Cats();

        // o.makan(); // => error karena tidak ada method makan di Object class
        a.makan();
        c.makan();

        Object object = c; // bisa langsung di assign
        Animals animals1 = c; // bisa langsung di assign

        // object.makan(); // -> error karena tidak ada method makan di Object class
        animals1.makan();

        Cats cats1 = (Cats) a; // tidak bisa langsung di assign, perlu casting
        cats1.makan();

        Animals harimau = new Animals();
        Cats anggora = (Cats) harimau; // compile ok tetapi runtime error ClassCastExeception
    }
}
