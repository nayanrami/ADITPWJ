
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.id = 1;
        student1.name = "nayan";

        student2.id = 1;
        student2.name = "nayan";

        System.out.println("Student 1" + student1);
        System.out.println("Student 2" + student2);

        if (student1 == student2) {
            System.out.println("Same Student");
        } else {
            System.out.println("Student 1 == Student 2 Fail");
        }

        if (student1.equals(student2)) {
            System.out.println("Same Student");
        } else {
            System.out.println("Student1.equals(Student2) Fail");
        }

        if (student1.id == student2.id && student1.equals(student2.name)) {
            System.out.println("Same Student");
        }
    }
}
