package context;

import java.sql.SQLException;

public class BoatsRepository {

    private IDbContext context;

    public BoatsRepository(IDbContext context) {
        this.context = context;
    }

    public BoatDTO get(int id) {
        var result = context.execute("SELECT * FROM boats WHERE id= " + id);

        BoatDTO boat = null;
        try{
            if(result !=null && result.next())
            {
                boat = new BoatDTO(result.getInt("id"),
                        result.getString("brand"),
                        result.getString("countryOfOrigin"),
                        result.getInt("enginePower"),
                        result.getDouble("length"),
                        result.getString("model"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return boat;
    }
}
