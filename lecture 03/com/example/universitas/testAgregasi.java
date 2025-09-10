package com.example.universitas;

public class testAgregasi {
    public static void main(String[] args) {
        Dosen pakBudi = new Dosen("d01","Budi Suwignyo");
        Dosen buSusi = new Dosen("d02","Susi Susanti");
        Dosen pakBenyamin = new Dosen("d03","Benyamin Kusuma");

        Prodi informatika = new Prodi("Informatika");
        informatika.addDosen(pakBudi);
        informatika.addDosen(buSusi);
        informatika.addDosen(pakBenyamin);
        informatika.displayDosen();
    }
}
