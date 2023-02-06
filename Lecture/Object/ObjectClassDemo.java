import java.util.EnumMap;

class ObjectClassDemo {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Nayan", "it.nayanmali@adit.ac.in");
        System.out.println(employee);

    }
}

class Employee {
    private int id;
    private String name;
    private String email;

    Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "[id " + id + " name: " + name + " email:" + email + "]";
    }

}