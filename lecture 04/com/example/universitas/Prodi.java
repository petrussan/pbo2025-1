package com.example.universitas;

import java.util.ArrayList;
import java.util.List;

public class Prodi {
    private String nama;
    private List<Dosen> daftarDosen;

    public Prodi(String nama) {
        this.nama = nama;
        this.daftarDosen = new ArrayList<>();
    }

    public void addDosen(Dosen d) {
        this.daftarDosen.add(d);
    }

    public void displayDosen() {
        System.out.println("Daftar dosen Prodi "+this.nama);
        for (Dosen d:daftarDosen) {
            System.out.println("- "+d.getNama());
        }
    }
}
