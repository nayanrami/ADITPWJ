package Lecture.EmployeeMgt;

class Employee {
    private long id;
    private String name;
    private String designation;
    private double payperhr;
    private double worknghr[];
    private double finalsal;;

    public void setFinalSal(double salary) {
        this.finalsal = salary;
    }

    public double getFinalSal() {
        return finalsal;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setPayPerHr(double payperhr) {
        this.payperhr = payperhr;
    }

    public double getPayPerHr() {
        return payperhr;
    }

    public void setWorkngHr(double[] worknghr) {
        this.worknghr = worknghr;
    }

    public double[] getWorkingHr() {
        return worknghr;
    }

    public String toString() {
        String str = "Id" + id + "\nName" + name + "\nDesignation" + designation + "\nPay Per Hr: " + payperhr;
        for (double wh : worknghr) {
            System.out.println(wh);
        }
        System.out.println("Final Salary : " + finalsal);
        return str;
    }
}