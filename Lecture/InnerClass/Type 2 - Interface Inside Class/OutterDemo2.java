
public class OutterDemo2 {
    public void m1() {
        System.out.println("M1 Called..");
    }

    interface Inner {
        public void m2();
    }

}

class InnerDemo implements OutterDemo2.Inner {
    @Override
    public void m2() {
        System.out.println("M2 Called..");
    }
}

class Main {
    public static void main(String[] args) {

        OutterDemo2 innerDemo = new OutterDemo2();
        innerDemo.m1();

        InnerDemo innerDemo2 = new InnerDemo();
        innerDemo2.m2();

        OutterDemo2.Inner outterDemo2 = new OutterDemo2.Inner() {

            @Override
            public void m2() {
                System.out.println("M2 Called..");
            }

        };

        outterDemo2.m2();
    }
}