public class ocp { //hitung diskon
    double hitung(String tipe, double harga) {
        if (tipe.equals("Regular")) {
            return harga;
        } else if (tipe.equals("VIP")) {
            return harga*0.9;
        }
        return harga;
    }
    
}  // ada jenis pelanggan baru, mengubah codebase

// interface skemaDiskon

interface skemaDiskon {
    double hitung(double harga);
}

class DiskonRegular implements skemaDiskon {

    @Override
    public double hitung(double harga) {
        return harga;
    }
}

class DiskonVIP implements skemaDiskon {

    @Override
    public double hitung(double harga) {
        return harga * 0.9;
    }
    
}

class DiskonGrosir implements skemaDiskon {

    @Override
    public double hitung(double harga) {
        return harga * 0.85;
    }

}