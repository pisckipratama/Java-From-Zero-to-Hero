package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Captain America";
        heroes[1] = "Iron Man";
        // heroes[2] = "Hulk"; // error

        // menggunakan arrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // untuk menambahakan object ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // object lainnya masih bisa ditambahakan ke list

        System.out.println("*** List Planet Awal ***");
        for (int i = 0; i < planets.size(); i++) { // method size untuk mendapatkan ukuran list
            System.out.println("index ke-" + i + " = " + planets.get(i)); // method get untuk melihat isi dari list
        }

        planets.remove("venus"); // untuk menghapus object dari list
        System.out.println("");

        System.out.println("*** List Planet Akhir ***");
        for (int i = 0; i < planets.size(); i++) { // method size untuk mendapatkan ukuran list
            System.out.println("index ke-" + i + " = " + planets.get(i)); // method get untuk melihat isi dari list
        }
    }
}
