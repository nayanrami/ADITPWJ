import java.util.Arrays;
import java.util.Scanner;

public class Array {
    int data[];
    Scanner scanner;

    public Array() {
        data = new int[10];
        data[0] = 10;
        data[1] = 72;
        data[2] = 59;
        data[3] = 23;
        data[4] = 54;
        data[5] = 26;
        data[6] = 90;
        data[7] = 6;
        data[8] = 5;
        data[9] = 2;
    }

    public Array(int size) {
        data = new int[size];
        scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            data[i] = value;
        }
    }

    public Array(int recdata[]) {
        data = recdata;
    }

    void display() {
        System.out.println("Array Values = ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }

    public void size() {
        System.out.println("Size of Array " + data.length);
    }

    public void sorting() {
        System.out.println("Sorting Array");
        Arrays.sort(data);
    }

    public void maxArray() {
        //
    }

    public void search(int value) {
        int pos = Arrays.binarySearch(data, value);
        if (pos > 0) {
            System.out.println("Found Element " + pos);
        } else {
            System.out.println("Element Not Found");
        }
    }
}
