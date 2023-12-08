package Data.sql.demo;
import java.sql.*;
public class Test {
    // Блок объявления констант
    public static final String DB_URL = "jdbc:h2:/c/java/SQLDemo/db/company";
    public static final String PASSWORD = "";
    public static final String USER = "sa";
    private Connection connection;



    public Test() {
            try {
                connection =
                        DriverManager.getConnection(DB_URL, USER, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException("Error while db connecting: " + e.getMessage());
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }
