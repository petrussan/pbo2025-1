package com.game.example;

public class testCharacter {
    public static void main(String[] args) {
        wizard gandalf = new wizard("Gandalf", 100,200);
        soldier soldier01 = new soldier("Aragon",150,100);

        gandalf.displayinfo();
        gandalf.castSpell("Accio");

        soldier01.displayinfo();
        soldier01.standDefense();
        soldier01.displayinfo();

    }
}
