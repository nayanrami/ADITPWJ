
public class StringDemo {
    public static void main(String[] args) {
        String name1 = "nayan";
        String name2 = "Nayan";

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Welcome " + name1);
        } else {
            System.out.println("Sorry");
        }

    }
}
