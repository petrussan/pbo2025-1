package com.orchestra.example;

public class violinist extends musician{
    public violinist(String n) {
        super(n);
    }

    @Override
    public void playNote() {
        System.out.println(this.nama+" playing violin");
    }

    public void pluckString() {
        System.out.println(this.nama+" plucking a string");
    }
}
