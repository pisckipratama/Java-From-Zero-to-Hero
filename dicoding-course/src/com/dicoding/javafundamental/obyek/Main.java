package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {
        Hewan objekHewan = new Hewan();
        objekHewan.cetakNama("Elang");
        objekHewan.cetakUmur(3);
        System.out.println("");

        Animals Chicken = new Animals("Chicken");
        Chicken.animalHeight(6);
        Chicken.totalFoots(2);
        Chicken.printAnimalInfo();
        System.out.println("");

        Animals Cow = new Animals("Cow");
        Cow.animalHeight(90);
        Cow.totalFoots(4);
        Cow.printAnimalInfo();
    }
}
