package com.orchestra.example;

public class trumpeter extends musician {
    public trumpeter(String n) {
        super(n);
    }

    @Override
    public void playNote() {
        System.out.println(this.nama+" playing trumpet");
    }
    
}
