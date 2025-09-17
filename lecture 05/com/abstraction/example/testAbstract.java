package com.abstraction.example;

public class testAbstract {
    public static void main(String[] args) {
        // bangundatar b1; 

        // b1 = new bangundatar("black");       

        Lingkaran l1;
        l1 = new Lingkaran("black", 15);
        l1.gambar();
        // System.out.println("Radius l1: "+l1.radius);
        System.out.println("Luas l1: " + l1.hitungLuas());
    }
    
}
