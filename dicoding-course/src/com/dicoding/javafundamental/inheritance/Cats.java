package com.dicoding.javafundamental.inheritance;

public class Cats extends Animals implements Mamalia {
    private String ras;
    private String habitat;

    Mamalia mamalia = new Cats();
    public Cats(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cats) {
            Cats other = (Cats) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Cats() {
        // super(); // akan tetap memanggil konstruktor dari parent class
        System.out.println("construct cats");
    }

    public void makan() { // overriding
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
