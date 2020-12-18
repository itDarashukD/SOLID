package first.singleReponsibility.instance2EmployeeArhitecture;


public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object o, TypeFormat typeFormat) {
        switch (typeFormat) {
            case XML:
                formattedOutput = convertedObjectToXML(o);
                break;
            case CSV:
                formattedOutput = convertedObjectTOCSV(o);
                break;
        }

    }


    private String convertedObjectToXML(Object o) {
        return "converted to XML" + o.toString();
    }

    private String convertedObjectTOCSV(Object o) {
        return "converted to CSV" + o.toString();
    }
}
