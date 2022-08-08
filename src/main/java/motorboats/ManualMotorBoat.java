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
                           int enginePower, boolean isThereACabin, int maxSpeed) {
        super(brand, model, countryOfOrigin, length, price, seats, projectCategory, hullMaterial,
                hullType, maxSpeed);
        this.brand = brand;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
        this.length = length;
        this.price = price;
        this.seats = seats;
        this.projectCategory = projectCategory;
        this.hullMaterial = hullMaterial;
        this.hullType = hullType;
        this.typeOfFuel = typeOfFuel;
        this.enginePower = enginePower;
        this.isThereACabin = isThereACabin;
    }
}

