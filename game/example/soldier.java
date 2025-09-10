package com.game.example;

public class soldier extends gamecharacter {
    private int stamina;

    public soldier(String n, int h, int s) {
        super(n,h);
        this.stamina = s;
    }

    public void standDefense() {
        if (this.stamina >= 10) {
            System.out.println(this.nama+" strenghten defense");
            this.healthPoint += 20;
            this.stamina -= 15;
        }
    }
    
}
