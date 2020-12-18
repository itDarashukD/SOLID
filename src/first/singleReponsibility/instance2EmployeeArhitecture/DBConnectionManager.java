package first.singleReponsibility.instance2EmployeeArhitecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private Connection connection;

    DBConnectionManager dbConnectionManager = new DBConnectionManager();

    public DBConnectionManager() {
    }
    public Connection getConnection() {
        return connection;
    }

   public void connect() throws SQLException {
        connection = DriverManager.getConnection("DB URL");
       System.out.println("connection to DB was established");
   }


   public void disconnected() throws SQLException {
        connection.close();
       System.out.println("  disconnected from DB");
   }



}
