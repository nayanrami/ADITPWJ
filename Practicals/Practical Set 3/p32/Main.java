class Main {
    public static void main(String[] args) {
        Time t1 = new Time(1, 1, 1);
        Time t2 = new Time(1, 1, 1);

        Time t3 = t1.sumTime(t2);
        System.out.println("Time 3" + t3);
    }
}
