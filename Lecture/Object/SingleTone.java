public class SingleTone {
    public static void main(String[] args) {
        Demo demo1 = Demo.createObject();
        Demo demo2 = Demo.createObject();
        Demo demo3 = Demo.createObject();
        Demo demo4 = Demo.createObject();
        Demo demo5 = Demo.createObject();

        demo1.getMessage();
        demo2.getMessage();
        demo3.getMessage();
        demo4.getMessage();
        demo5.getMessage();
    }
}

class Demo {
    private static Demo demo = null;

    private Demo() {
        System.out.println("Object Created...");
    }

    static Demo createObject() {
        if (demo == null)
            demo = new Demo();

        return demo;
    }

    void getMessage() {
        System.out.println("Single Tone Object");
    }
}
