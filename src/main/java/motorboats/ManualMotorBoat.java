package motorboats;

import boats.HullMaterial;
import boats.HullType;
import boats.Manual;

public class ManualMotorBoat extends Manual {

    private final String brand;
    private final String model;
    private final String countryOfOrigin;
    private double length;
    private double price;
    private final int seats;
    private char projectCategory;
    private final HullMaterial hullMaterial;
    private final HullType hullType;

    private final TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;

    public ManualMotorBoat(String brand, String model, String countryOfOrigin, double length,
                           double price, int seats, char projectCategory, HullMaterial hullMaterial,
                           HullType hullType, String brand1, String model1, String countryOfOrigin1,
                           double length1, double price1, int seats1, char projectCategory1,
                           HullMaterial hullMaterial1, HullType hullType1, TypeOfFuel typeOfFuel,
                           int enginePower, boolean isThereACabin) {
        super(brand, model, countryOfOrigin, length, price, seats, projectCategory, hullMaterial,
                hullType);
        this.brand = brand1;
        this.model = model1;
        this.countryOfOrigin = countryOfOrigin1;
        this.length = length1;
        this.price = price1;
        this.seats = seats1;
        this.projectCategory = projectCategory1;
        this.hullMaterial = hullMaterial1;
        this.hullType = hullType1;
        this.typeOfFuel = typeOfFuel;
        this.enginePower = enginePower;
        this.isThereACabin = isThereACabin;
    }
}

