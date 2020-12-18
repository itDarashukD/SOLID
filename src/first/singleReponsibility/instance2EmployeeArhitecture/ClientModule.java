package first.singleReponsibility.instance2EmployeeArhitecture;

public class ClientModule {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"dima","builders",true);
        ClientModule.hireEmployee(employee1);
        ClientModule.printEmployeeReport(employee1,TypeFormat.CSV);
    }

    public static void hireEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.add(employee);
    }

    public static void deleteEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.delete(employee);
    }
    public static void printEmployeeReport(Employee employee,TypeFormat typeFormat){
        EmployeeReportFormatter reportFormatter = new EmployeeReportFormatter(employee,typeFormat);
        System.out.println(reportFormatter.getFormattedEmployee());

    }

}
