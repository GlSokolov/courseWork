public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;
    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return +id+". "+fullName+
                ", Номер отдела: "+department+
                ", Зарплата: "+salary+
                "руб.";
    }
}
