class Student {
    int id;
    String name;
    String address;

    // Default Constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Set Value using method
    public void setStudent(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("\nId : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}

class Main {
    public static void main(String[] args) {
        // Create Student Objects and pass object value through set method
        Student student1 = new Student();
        student1.setStudent(10, "Nayan", "PADRA");
        student1.display();

        // Create Student Objects and pass object value through constructor

        Student student2 = new Student(20, "Keyur", "VALSAD");
        student1.display();

        // Create Student Object without name and call method
        new Student(30, "Ravi", "Anand").display();

    }
}