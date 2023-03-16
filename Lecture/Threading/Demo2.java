class Demo2 {
    public static void main(String[] args) {
        MyThreadDemo demo = new MyThreadDemo();
        Thread thread1 = new Thread(demo);
        Thread thread2 = new Thread(demo);
        thread1.start();
        thread2.start();

    }
}

class MyThreadDemo implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + ":" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}