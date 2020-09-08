package autonumber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static Connection conn = null;
    public static Connection getConn() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        if(conn == null){
            conn = DriverManager.getConnection("jdbc:mysql://localhost/generated_number", "root", "");
        }
        return conn;
    }
}
