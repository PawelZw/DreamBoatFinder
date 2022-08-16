package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbContext {
    private static final String connectionString = "jdbc:mysql://localhost:3306/baza";
    private static final String username = "root";
    private static final String password = "";

    public void connect() {
        try {
            Connection connection = DriverManager.getConnection(connectionString, username, password);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM boats");
            statement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
