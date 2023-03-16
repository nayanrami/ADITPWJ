class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
    }

    void m1() {
        System.out.println("M1 Start..");
        m2();
        System.out.println("M1 End..");
    }

    void m2() {
        System.out.println("M2 Start..");
        try {
            m3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("M2 End..");
    }

    void m3() {
        System.out.println("M3 Start..");
        int c = 10 / 0;
        m4();
        System.out.println("M3 End..");
    }

    void m4() {
        System.out.println("M4 Start..");

        System.out.println("M4 End..");
    }

}