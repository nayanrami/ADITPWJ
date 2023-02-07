public class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    Time() {

    }

    Time sumTime(Time t1) {
        Time t3 = new Time();

        t3.hr = t1.hr + hr;
        t3.min = t1.min + min;
        t3.sec = t1.sec + sec;

        return t3;
    }

    public String toString() {
        return "[Hr" + hr + ", Min" + min + ", Sec" + sec + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Time t1 = new Time(1, 1, 1);
        Time t2 = new Time(1, 1, 1);

        Time t3 = t1.sumTime(t2);
        System.out.println("Time 3" + t3);
    }
}
