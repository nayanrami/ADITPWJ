
public class OutterDemo1 {
    public void m1() {
        System.out.println("M1 Called..");
    }

    interface Inner {
        public void m2();
    }

    public class InnerDemo implements Inner {
        @Override
        public void m2() {
            System.out.println("M2 Called..");
        }
    }
}

class Main {
    public static void main(String[] args) {

        OutterDemo1 outter = new OutterDemo1();
        OutterDemo1.InnerDemo innerDemo = outter.new InnerDemo();
        innerDemo.m2();
    }
}