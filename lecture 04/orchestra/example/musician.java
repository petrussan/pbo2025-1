package com.orchestra.example;

public class musician {
    protected String nama;

    public musician(String n) {
        this.nama = n;
    }

    public void playNote() {
        System.out.println(this.nama+" playing a note ");
    }
}
