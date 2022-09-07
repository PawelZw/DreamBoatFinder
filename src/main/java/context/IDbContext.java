package context;

import java.sql.ResultSet;

public interface IDbContext {                           //interface containing methods connect and close
    void connect();
    void close();
    ResultSet execute(String query);
}
