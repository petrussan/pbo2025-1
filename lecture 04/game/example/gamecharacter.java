package com.game.example;

public class gamecharacter {
    protected String nama;
    protected int healthPoint;

    public gamecharacter(String n, int h) {
        this.nama = n;
        this.healthPoint = h;
    }

    public void attack(gamecharacter target) {
        System.out.println(this.nama + "attacking " + target.nama);
    }

    public void displayinfo() {
        System.out.println("Nama : "+this.nama);
        System.out.println("Health Point: "+this.healthPoint);
    }
}