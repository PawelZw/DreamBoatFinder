package motorboats;

import boats.HullMaterial;
import boats.HullType;

public class Submarine extends MotorBoat {

    private int maximumImmersionDepth;


    public Submarine(String brand, String model, String countryOfOrigin, double length, double price,
                     int seats, char projectCategory, HullMaterial hullMaterial, HullType hullType,
                     TypeOfFuel typeOfFuel, int enginePower, boolean isThereACabin, double weight,
                     int maxSpeed) {
        super(brand, model, countryOfOrigin, length, price, seats, projectCategory, hullMaterial,
                hullType, typeOfFuel, enginePower, isThereACabin, weight, maxSpeed);
    }
}

