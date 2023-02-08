interface A {
    public void m1();
}

interface X {
    public void x1();
}

interface B extends A, X {
    public void m2();
}

class C {
    public void m3() {
        System.out.println("M3 Called..");
    }
}

class Test extends C implements A, B {
    @Override
    public void m2() {
        System.out.println("M2 Called..");
    }

    @Override
    public void m1() {
        System.out.println("M1 Called..");
    }

    @Override
    public void x1() {
        System.out.println("X1 Called..");

    }
}

class Demo {
    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m2();
        test.m3();
        test.x1();
    }
}