class Car {
    int i;

    Car() {
        System.out.println("I am Car");
    }

    Car(int i) {
        this.i = i;
        System.out.println("Wheel " + i);
    }

    public void toStart() {
        System.out.println("Start By key");
    }
}

class Maruti extends Car {
    Maruti() {
        super(4);
        System.out.println("I am Maruti");
    }

    public void toStart() {
        super.toStart();
        System.out.println("Self Button");
    }

}

public class SuperDemo {
    public static void main(String[] args) {
        Maruti maruti = new Maruti();
        maruti.toStart();

    }
}
