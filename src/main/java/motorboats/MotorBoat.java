package motorboats;

import boats.Boat;
import boats.HullMaterial;
import boats.HullType;

public class MotorBoat extends Boat {
    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;


    public MotorBoat(String brand1, String model1, String countryOfOrigin1, double length1,
                     double price1, int seats1, char projectCategory1, HullMaterial hullMaterial1,
                     HullType hullType1, TypeOfFuel typeOfFuel, int enginePower, boolean isThereACabin, double weight) {
        super(brand1, model1, countryOfOrigin1, length1, price1, weight, seats1, projectCategory1,
                hullMaterial1, hullType1);

        this.typeOfFuel = typeOfFuel;
        this.enginePower = enginePower;
        this.isThereACabin = isThereACabin;
    }


    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isThereACabin() {
        return isThereACabin;
    }
}


