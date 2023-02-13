
public class Match extends Cricket {
    private int odi;
    private int test;

    public String toString() {
        System.out.println(super.toString());
        return "[Odi = " + odi + " Test =" + test + "]";
    }

    public void setOdi(int odi) {
        this.odi = odi;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getOdi() {
        return odi;
    }

    public int getTest() {
        return test;
    }
}
