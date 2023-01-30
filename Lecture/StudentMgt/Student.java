public class Student {
    private long enrollmentno;
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    private double subject5;

    public void setMarks(double subject1, double subject2, double subject3, double subject4, double subject5) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    public void display() {
        System.out.println("Enrollment Number " + enrollmentno);
        System.out.println("Subject 1 " + subject1);
        System.out.println("Subject 2 " + subject2);
        System.out.println("Subject 3 " + subject3);
        System.out.println("Subject 4 " + subject4);
        System.out.println("Subject 5 " + subject5);
    }
}
