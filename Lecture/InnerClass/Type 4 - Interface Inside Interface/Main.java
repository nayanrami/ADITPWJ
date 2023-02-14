interface Outter {
    public void m1();

    interface Inner {
        public void m2();
    }
}

class Demo implements Outter.Inner {

    @Override
    public void m2() {
        System.out.println("M2 Called..");
    }

}

class Main {
    public static void main(String[] args) {

        Outter.Inner inner = new Outter.Inner() {
            @Override
            public void m2() {
                System.out.println("M2 Called..");
            }
        };

        inner.m2();

        Demo demo = new Demo();
        demo.m2();

    }
}