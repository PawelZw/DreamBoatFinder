package sailingboats;

import boats.Boat;
import boats.HullMaterial;
import boats.HullType;

public class SailingBoat extends Boat {
    public SailingBoat(String brand, String model, String countryOfOrigin, double length,
                       double price, int seats, char projectCategory, HullMaterial hullMaterial,
                       HullType hullType, double weight, int maxSpeed) {
        super(brand, model, countryOfOrigin, length, price, weight, seats, projectCategory,
                hullMaterial, hullType, maxSpeed);
    }
}
