package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;

    private static Util instans = null;

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/DB_1";
            String login = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public static Util getInstance() {
        if (null == instans) {
            instans = new Util();
        }
        return instans;
    }


}
