public class isp {  //pekerja manusia dan pekerja robot
    
}

//bad isp
interface Pekerja {
    void kerja();
    void makan();
}

class Manusia implements Pekerja {

    @Override
    public void kerja() {
        System.out.println("Sedang bekerja");
    }

    @Override
    public void makan() {
        System.out.println("Sedang makan");
    }
    
}

class Robot implements Pekerja {

    @Override
    public void kerja() {
        System.out.println("Sedang bekerja");
    }

    @Override
    public void makan() {
        throw new UnsupportedOperationException("Robot tidak makan");
    }
}

// good isp --> interface segregation
interface bisaKerja {
    void kerja();
}

interface bisaMakan {
    void makan();
}

class Human implements bisaKerja, bisaMakan {

    @Override
    public void makan() {
        System.out.println("Sedang makan");
    }

    @Override
    public void kerja() {
        System.out.println("Sedang bekerja");
    }

}

class TheRobot implements bisaKerja {

    @Override
    public void kerja() {
        System.out.println("Sedang bekerja");
    }
    
}