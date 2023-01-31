
class StudentDemo {
    int id;
    String name;
}

class Demo {
    public static void main(String[] args) {
        StudentDemo student1 = new StudentDemo();
        StudentDemo student2 = new StudentDemo();

        student1.id = 1;
        student1.name = "Nayan";

        student2.id = 1;
        student2.name = "Nayan";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.equals(student2));

        String name1 = "Nayan";
        String name2 = "Nayan";

        System.out.println(name1.equals(name2));
    }
}
