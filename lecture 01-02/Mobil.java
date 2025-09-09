public class Mobil {
    private int maxspeed = 200;

    public void jalankan() {
        Mesin mesin = new Mesin();
        mesin.throttle();
    }
    
    public class Mesin {
        public void throttle() {
            System.out.println("throttle dibuka, kecepatan maks: "+maxspeed);

        }
    }
}