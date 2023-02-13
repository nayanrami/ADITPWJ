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

    Time sumTime(Time t2) {
        Time t3 = new Time();

        t3.hr = t2.hr + hr;
        t3.min = t2.min + min;
        t3.sec = t2.sec + sec;

        return t3;
    }

    public String toString() {
        return "[Hr" + hr + ", Min" + min + ", Sec" + sec + "]";
    }
}