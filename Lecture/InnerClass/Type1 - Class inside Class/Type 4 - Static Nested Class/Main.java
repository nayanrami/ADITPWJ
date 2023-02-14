
class Outter {
    static class Inner {
        public void m2() {
            System.out.println("M2 Called..");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outter.Inner inner = new Outter.Inner();
        inner.m2();
    }
}
