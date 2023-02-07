class Animal {
    public void eat() {
        System.out.println("Animal Eat");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog Eat");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        Animal animal2 = new Dog();
        animal2.eat();
    }
}
