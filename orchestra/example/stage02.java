package com.orchestra.example;

import java.util.ArrayList;
import java.util.List;

public class stage02 {
    public static void main(String[] args) {
        musician[] arrayPlayer;   //aray of objects
        arrayPlayer = new musician[10];

        // musician[] arrayPlayer = new musician[10];
        arrayPlayer[0] = new violinist("Albert");
        arrayPlayer[1] = new trumpeter("Bernard");
        
        ArrayList<musician> arraylistPlayer; //array list of objects
        arraylistPlayer = new ArrayList<>();

        arraylistPlayer.add(new violinist("Colby"));
        arraylistPlayer.add(new pianist("Dempsey"));

        List<musician> listPlayer; //list of objects
        listPlayer = new ArrayList<>();        

        listPlayer.add(new violinist("Edward"));
        listPlayer.add(new pianist("Farrel"));

        for (musician m:listPlayer) {
            m.playNote();
        }

    }
}
