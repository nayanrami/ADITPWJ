public class CalcSalary {
    Employee employee;

    public CalcSalary(Employee employee) {
        this.employee = employee;
    }

    public Employee getSalary() {
        double workinghr[] = employee.getWorkingHr();
        double payperhr = employee.getPayPerHr();
        double salary = 0;
        for (double working : workinghr) {
            salary = salary + (working * payperhr);
        }
        employee.setFinalSal(salary);
        return employee;
    }
}