package com.dicoding.javafundamental.obyek;

public class Animals {
    String name;
    int height;
    int totalFoots;

    // ini merupakan konstruktor dari kelas hewan.
    // konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan
    public Animals(String animalName) {
        name = animalName;
    }

    public void animalHeight(int animalHeight) {
        height = animalHeight;
    }

    public void totalFoots(int animalTotalFoots) {
        totalFoots = animalTotalFoots;
    }

    public void printAnimalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + "kg");
        System.out.println("Total Foots: " + totalFoots);
    }
}
