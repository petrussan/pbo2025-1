package id.ac.petra.model;

public class packagetest {
    static String idclass;
    double data;
    private double infonilai;

    public packagetest() {
        idclass = "ID CLASS";
        data = 100;
        infonilai = 200;
    }

    public packagetest(double d) {
        data = d;
    }

    public packagetest(double d, double i) {
        data = d;
        infonilai = i;
    }

    static void changeid(String i) {
        idclass = i;
    }

}


