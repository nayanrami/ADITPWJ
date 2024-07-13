import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int data[] = { 10, 50, 3, 8, 74, 9, 6, 71, 36 };
        Arrays.sort(data);

        for (int i : data) {
            System.out.println(i);
        }

        int value = Arrays.binarySearch(data, 74);
        System.out.println("Key Value : " + value);
    }
}