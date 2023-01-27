public class SingleTone {
    public static void main(String[] args) {
        new Demo();
    }
}

class Demo {
    private static Demo demo;

    private Demo() {
    }

    Demo createObject() {
        if (demo == null)
            return new Demo();
        return demo;
    }
}
