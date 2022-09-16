package motorboats;

import boats.Boat;
import boats.HullMaterial;
import boats.HullType;

public class MotorBoat extends Boat {
    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;


    public MotorBoat(String brand, String model, String countryOfOrigin, double length,
                     double price, int seats, char projectCategory, HullMaterial hullMaterial,
                     HullType hullType, TypeOfFuel typeOfFuel, int enginePower, boolean isThereACabin,
                     double weight, int maxSpeed) {
        super(brand, model, countryOfOrigin, length, price, weight, seats, projectCategory,
                hullMaterial, hullType, maxSpeed );

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

    @Override
    public String toString() {
        return super.toString() +
                "typeOfFuel=" + typeOfFuel +
                ", enginePower=" + enginePower +
                ", isThereACabin=" + isThereACabin +
                '}';
    }
}


