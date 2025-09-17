package com.abstraction.example;

public class Lingkaran extends bangundatar {
    private double radius;

    public Lingkaran(String w, double r) {
        super(w);
        this.radius = r;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hitungLuas'");
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar lingkaran dengan warna " + getWarna());
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'gambar'");
    }
    
}
