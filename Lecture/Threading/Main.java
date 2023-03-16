
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println(Thread.currentThread().getName());
        thread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        Thread.currentThread().setName("My Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread Running");
    }
}
