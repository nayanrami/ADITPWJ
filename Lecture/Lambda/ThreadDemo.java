public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());

            }
        });
        thread.start();

    }
}
