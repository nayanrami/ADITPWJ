public class Varlength {
    public static void main(String... args) {
        Varlength aVarlength = new Varlength();
        System.out.println(aVarlength.sum(10, 20, 30));

    }

    public int sum(int... value) {
        int sum = 0;
        for (int k : value) {
            sum = sum + k;
        }
        return sum;
    }
}
