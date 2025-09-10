package com.example.laptop;

public class Main {
    public static void main(String[] args) {
        laptop laptop1 =  new laptop();
        laptop laptop2 = laptop1;
        //laptop1 disalin ke laptop2? shallow copy 
        // laptop1 dan laptop 2 merujuk ke lokasi memory yang sama
        laptop laptop3 = new laptop();

        laptop laptopkloning = new laptop(laptop1);  //deep copy

        laptop laptop4 = new laptop("Core i9",32,512);
        laptop laptopkloning4 = new laptop(laptop4); //deep copy dari laptop4

        laptop1.tampilkandata("Spesifikasi laptop adalah: ");
        laptop1.tampilkandata("Spesifikasi CPU ", "Spesifikasi RAM",
             "Spesifikasi Storage");

    }
}
