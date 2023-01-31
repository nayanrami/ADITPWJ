
public class StringDemo {
    public static void main(String[] args) {
        String name1 = "Nayan";
        String name2 = "nayan";

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Welcome " + name1);
        } else {
            System.out.println("Sorry");
        }

    }
}
