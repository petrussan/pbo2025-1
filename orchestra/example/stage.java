package com.orchestra.example;

public class stage {
    public static void main(String[] args) {
        // musician player;


        // player = new violinist("Albert"); //upcasting
        // player.playNote();

        // player = new trumpeter("Bernard"); //upcasting
        // player.playNote();

        // player = new pianist("Cosby"); //upcasting
        // player.playNote();
        musician musician01;
        musician musician02;

        musician01 = new violinist("Albert");
        musician02 = new trumpeter("Bernard");

        // musician01.pluckString();  //error
        
        if (musician01 instanceof violinist) { //safeguard
            violinist v01 = (violinist) musician01; //downcasting
            v01.pluckString();
        }

        // //without safeguard, potential error
        // violinist v02 = (violinist) musician02;
        // v02.pluckString();

    }
}
