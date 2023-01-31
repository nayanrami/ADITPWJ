public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.toStart();
    }
}

class Car {
    public void toStart() {
        System.out.println("Starting..");
    }
}

class Swift extends Car {
    public void carname() {
        System.out.println("I am Swift");
    }
}