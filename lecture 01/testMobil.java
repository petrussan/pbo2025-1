public class testMobil {
    public static void main(String[] args) {
        Mobil avanza01 = new Mobil();
        avanza01.jalankan();

        Mobil.Mesin mesinavanza = avanza01.new Mesin();
        mesinavanza.throttle();
    }
}
