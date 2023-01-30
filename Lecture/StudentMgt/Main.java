public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMarks(50, 66, 76, 45, 98);

        Grade grade = new Grade(student);
        grade.result();
    }
}
