public class Cricket {
    private String name;
    private double age;

    public String toString() {
        return "[name= " + name + " age = " + age + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
}
