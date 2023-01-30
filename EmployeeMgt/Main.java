public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Nayan");
        employee.setPayPerHr(100.40);
        employee.setDesignation("Assistant Professor");
        employee.setWorkngHr(new double[] { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 });
        CalcSalary calcSalary = new CalcSalary(employee);
        calcSalary.getSalary();

        System.out.println(employee);
    }
}
