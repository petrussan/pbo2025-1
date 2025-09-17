package com.abstraction.example;

abstract class bangundatar {
    protected String warna;

    public bangundatar(String w) {
        this.warna = w;
    }

    public abstract double hitungLuas();
    public abstract void gambar();

    public String getWarna(){
        return this.warna;
    }
}