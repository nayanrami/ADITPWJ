public class StaticDemo1 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.x = 10;
        counter2.x = 20;
        counter3.x = 30;

        System.out.println("Counter 1 Instance Variable : X = " + counter1.x);
        System.out.println("Counter 2 Instance Variable : X = " + counter2.x);
        System.out.println("Counter 3 Instance Variable : X = " + counter3.x);

        // Assign Value to static variable
        counter1.y = 10;
        counter2.y = 10;
        counter3.y = 10;

        System.out.println("Counter 1 Static Variable : Y = " + counter1.y);
        System.out.println("Counter 2 Static Variable : Y = " + counter2.y);
        System.out.println("Counter 3 Static Variable : Y = " + counter3.y);

        // Assign Value to Static variable without reference Class.Variable
        Counter.y = 50;
        System.out.println("Counter Class Static Variable : Y = " + Counter.y);

        // final variable can not be modified
        System.out.println("Counter 1 final variable k " + counter1.k);
        System.out.println("Counter 2 final variable k " + counter2.k);
        System.out.println("Counter 3 final variable k " + counter3.k);

        // calling instance method
        counter1.m1();
        counter2.m1();
        counter3.m1();

        // calling instance method Class.method

        Counter.m2();
    }
}

class Counter {
    int x; // instance variable
    static int y;// static variable
    final int k = 10; // final variable assign value

    /*
     * Instance Method
     */
    public void m1() {
        System.out.println("M1 Instance Method Method");
    }

    public static void m2() {
        System.out.println("M2 Static Method");
    }
}
