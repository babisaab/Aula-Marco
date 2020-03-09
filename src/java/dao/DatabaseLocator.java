package dao;


import java.sql.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseLocator {

    public static DatabaseLocator instance = new DatabaseLocator();

    public static DatabaseLocator getInstance() {
        return instance;
    }

    private DatabaseLocator() {
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/designpattern", "root", "");
        return conn;
    }
}
