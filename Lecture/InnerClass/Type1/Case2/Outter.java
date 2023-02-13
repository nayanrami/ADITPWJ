/*
 * Access Inner Class from Outter Class
 */
public class Outter {
    public void m1() {
        System.out.println("M1 Called..");
        Inner inner = new Inner();
        inner.m2();

    }

    class Inner {
        public void m2() {
            System.out.println("M2 Called..");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.m1();
    }
}
