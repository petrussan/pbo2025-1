package com.abstraction.example;

public class Drone implements BisaTerbang {

    @Override
    public void terbang() {
        System.out.println("Drone mengaktifkan baling-baling untuk terbang");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'terbang'");
    }

    @Override
    public void mendarat() {
        System.out.println("Drone mendarat secara vertikal");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mendarat'");
    }
    
}
