abstract class Popcorn {
    public abstract void flavor();
}

class CheesePopcorn extends Popcorn {
    @Override
    public void flavor() {
        System.out.println("Cheese Popcorn");
    }
}

class Main {
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn() {
            @Override
            public void flavor() {
                System.out.println("Sweet Popcorn");
            }
        };
        popcorn.flavor();
    }
}