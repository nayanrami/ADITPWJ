import java.util.function.Consumer;
import java.util.function.Supplier;

class Movie {
    String name;

    public Movie(String name) {
        this.name = name;
    }
}

class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println(m.name = " Release Today 1");
        Consumer<Movie> c2 = m -> System.out.println(m.name = " Release Today 2");
        Consumer<Movie> c3 = m -> System.out.println(m.name = " Release Today 3");

        c1.accept(new Movie("Test"));
        c1.andThen(c3).accept(new Movie("Hero2"));

        Supplier<String> otp = () -> {
            return String.valueOf((int) (Math.random() * 10000));
        };

        System.out.println(otp.get());
    }
}