public class InnerClassDemo {
    // Static inner class
    static class StaticInner {
        void display() {
            System.out.println("This is a static inner class.");
        }
    }

    public void demoLocalInnerClass() {
        // Local inner class
        class LocalInner {
            void display() {
                System.out.println("This is a local inner class.");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public void demoAnonymousInnerClass() {
        // Anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        // Static inner class usage
        StaticInner staticInner = new StaticInner();
        staticInner.display();

        // Local inner class usage
        InnerClassDemo outer = new InnerClassDemo();
        outer.demoLocalInnerClass();

        // Anonymous inner class usage
        outer.demoAnonymousInnerClass();
    }
}
