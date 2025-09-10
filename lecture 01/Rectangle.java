public class Rectangle {
    double panjang;
    private double lebar;
    private double luas;

    public void setpl(double p, double l) {
        panjang = p;
        lebar = l;
    }

    public void setpanjang(double p) {
        panjang = p;
    }

    public void setlebar(double l) {
        lebar = l;
    }

    public double getluas() {
        luas = panjang*lebar;
        return luas;
    }
}
