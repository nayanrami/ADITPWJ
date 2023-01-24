class Student {
    int id;
    String name;
    String address;
}

class Main {
    public static void main(String[] args) {
        // Create Student Objects
        Student student1 = new Student();
        Student student2 = new Student();
        // Accessing Student Object states

        student1.id = 10;
        student2.id = 10;

        student1.name = "Nayan";
        student2.name = "Keyur";

        student1.address = "Padra";
        student2.address = "Valsad";

        System.out.println("Student 1 Information ");
        System.out.println("Id " + student1.id);
        System.out.println("Name " + student1.name);
        System.out.println("Address " + student1.address);

        System.out.println("Student 2 Information ");
        System.out.println("Id " + student2.id);
        System.out.println("Name " + student2.name);
        System.out.println("Address " + student2.address);

    }
}