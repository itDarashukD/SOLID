package first.singleReponsibility.instance2EmployeeArhitecture;

public class EmployeeReportFormatter extends ReportFormatter{


    public EmployeeReportFormatter(Object o, TypeFormat typeFormat) {
        super(o, typeFormat);
    }
    public String getFormattedEmployee(){
        return formattedOutput;
    }
}
