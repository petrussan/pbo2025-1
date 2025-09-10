package com.orchestra.example;

public class pianist extends musician{

    public pianist(String n) {
        super(n);
    }

    @Override
    public void playNote() {
        System.out.println(this.nama+" playing piano");
    }
}
