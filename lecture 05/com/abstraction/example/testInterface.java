package com.abstraction.example;

public class testInterface {
    public static void main(String[] args) {
        Burung b1;
        Drone d1;

        b1 = new Burung();
        d1 = new Drone();

        b1.terbang();
        b1.mendarat();
        b1.Bertelur();
        d1.terbang();
        d1.mendarat();
    }    
}
