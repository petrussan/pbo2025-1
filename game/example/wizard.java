package com.game.example;

public class wizard extends gamecharacter {
    int manaPoint;

    public wizard(String n, int h, int m) {
        super(n,h); //calling parent's constructor
        this.manaPoint = m;
    }

    public void castSpell(String spell) {  
        System.out.println(this.nama + "cast "+ spell);
    }

    // public void castSpell(Spell s) {
    //     System.out.println(this.nama + " cast "+ s.nama);
    // }

    @Override
    public void attack(gamecharacter target) {
        super.attack(target); 
        if (this.manaPoint >=10) 
            System.out.println(this.nama + "attack with fire spell to "+target.nama);
        else 
            System.out.println(this.nama + "can not attack, manapoint low");
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Mana Point: "+this.manaPoint);
    }
}
