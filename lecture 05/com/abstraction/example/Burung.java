package com.abstraction.example;

import java.util.Random;

public class Burung implements BisaTerbang, BisaBertelur {

    @Override
    public void terbang() {
        System.out.println("Burung mengepakkan sayap untuk terbang");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'terbang'");
    }

    @Override
    public void mendarat() {
        System.out.println("Burung mendarat di dahan pohon");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mendarat'");
    }

    @Override
    public void Bertelur() {
        Random n = new Random();

        System.out.println("Burung bertelur "+n.nextInt(3)+" butir");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Bertelur'");
    }
    
}
