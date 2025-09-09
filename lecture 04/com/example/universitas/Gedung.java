package com.example.universitas;

import java.util.ArrayList;
import java.util.List;

class Ruang {
    private String noRuang;
    public Ruang(String n) {
        this.noRuang = n;
    }

    public String getnoRuang() {
        return this.noRuang;
    }
    
}

public class Gedung {
    private String namaGedung;
    private List<Ruang> daftarRuangan;
    
    public Gedung(String n, int jumlahRuang) {
        this.namaGedung = n;
        this.daftarRuangan = new ArrayList<>();

        for(int i=1;i<=jumlahRuang;i++) {
            this.daftarRuangan.add(new Ruang(n+"-"+i));
        }
    }
    
    public void displayRuang() {
        System.out.println("Ruangan di dalam gedung "+this.namaGedung);
        for (Ruang r: daftarRuangan) {
            System.out.println("- "+r.getnoRuang());
        }
    }
} 