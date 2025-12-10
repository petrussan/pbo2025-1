public class dip { //saklar --> lampu 
    
}

//dip bad

class lampu {
    void nyala() {

    }

    void mati() { 

    }
}

class Saklar {
    lampu lampuku //hard dependency --> ketergantungan langsung

    public Saklar() {
        this.lampuku = new lampu();
    }

    void tekan() {
        lampuku.nyala();
    }
}


// good dip

interface BarangElektronik {
    void nyala();
    void mati();
}

class Lampu implements BarangElektronik {

    @Override
    public void nyala() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nyala'");
    }

    @Override
    public void mati() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mati'");
    }

}

class KipasAngin implements BarangElektronik {

    @Override
    public void nyala() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nyala'");
    }

    @Override
    public void mati() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mati'");
    }
    
}

class Soket {
    BarangElektronik barang

    public Soket(BarangElektronik barang) { //dependency injection
        this.barang = barang;
    }

    void tekan() {
        barang.nyala();
    }
}
