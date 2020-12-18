package first.singleReponsibility.instance2EmployeeArhitecture;

public class Employee {

    private int id;
    private String name;
    private String department;
    private Boolean working;

    public Employee(int id, String name, String department, Boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
