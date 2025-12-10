public class lsp {  // bad lsp
    
}

class Burung {
    void terbang() {
        System.out.println("Burung terbang ....");
    }
}

class Penguin extends Burung {
    @Override
    void terbang() {
        throw new UnsupportedOperationException("Penguin tidak bisa terbang");
    }
}

// good LSP

class Bird {
    void makan() {
        System.out.println("Burung makan ....");
    }
}

class FlyingBird extends Bird { 
    void terbang() {
        System.out.println("Burung terbang ....");       
    }
}

class Elang extends FlyingBird {

}

class Puffin extends Bird {

}