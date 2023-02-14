/*
 * Access Inner Class Outside of Outter Class 
 */
public class Outter {
    public void m1() {
        System.out.println("M1 Called..");

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
        Outter.Inner inner = outter.new Inner();
        outter.m1();
        inner.m2();
    }
}
