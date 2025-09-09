package com.example.laptop;

public class laptop {
    private String cpu;
    private int ram; //dalam GB
    private int storage; // dalam GB
    //private int gpu; 

    public laptop() {  //default constructor
      //  this.cpu = "....";
      this("Intel i5",8,256);
    }

    //Copy Constructor
    public laptop(laptop source){
        this(source.cpu,source.ram,source.storage);
    }

    public laptop(int ram, int storage) { //custom ram & storage
        this("Intel i5", ram, storage);
    }
    public laptop(String cpu, int ram, int storage) { //custom constructor
        this.cpu=cpu;
        this.ram=ram;
        this.storage=storage;
    }

    public void tampilkandata(String teks1) {
        System.out.println(teks1);
        System.out.println(cpu +","+ram+","+storage);
    }

    public void tampilkandata(String teks1, String teks2, String teks3) {
        System.out.println(teks1 + ":"+ cpu);
        System.out.println(teks2 + ":"+ ram);
        System.out.println(teks3 + ":"+ storage);
        
    }

}
