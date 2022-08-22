package context;

import java.sql.*;

public class DbContext implements IDbContext{
    private static final String connectionString = "jdbc:mysql://localhost:3306/baza";
    private static final String username = "root";
    private static final String password = "";

    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM boats");
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close()
    {
        if(connection != null)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public ResultSet execute(String query)
    {
        if(connection == null)
        {
            return null;
        }

        try {
            Statement statement = connection.createStatement();
            var result = statement.executeQuery(query);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
