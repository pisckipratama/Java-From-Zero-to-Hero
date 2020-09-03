package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String 1"); // lo menampung object string
        lo.add(new Planet("Mercury", 0.06)); // lo menampung object Planet

        for (Object o : lo) {
            Planet p = (Planet) o; // perlu type casting dari object ke planet
            p.print();
        }

        List<Planet> lp = new ArrayList<>(); // List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp menampung object Planet
        // lp.add("lp - String 1") // error, lp tidak diijinkan menampung object String

        for (Planet p : lp) {
            p.print();
        }
    }
}
