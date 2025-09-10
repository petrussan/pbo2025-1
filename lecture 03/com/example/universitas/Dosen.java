package com.example.universitas;

public class Dosen {
    private String id;
    private String nama;
    
    public Dosen(String i, String n) {
        this.id = i;
        this.nama = n;
    }

    public String getNama() {
        return this.nama;
    }

    public void Menulis(Spidol spidol) {
        System.out.println(this.nama + 
            " sedang menulis dengan spidol warna "+spidol.getWarna());       
    }

}