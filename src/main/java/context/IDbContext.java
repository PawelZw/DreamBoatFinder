package context;

import java.sql.ResultSet;

public interface IDbContext {
    void connect();
    void close();
    ResultSet execute(String query);
}
