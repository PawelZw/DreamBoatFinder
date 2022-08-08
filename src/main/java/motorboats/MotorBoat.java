package motorboats;

import boats.Boat;
import boats.HullMaterial;
import boats.HullType;

public class MotorBoat extends Boat {

    private final String brand;
    private final String model;
    private final String countryOfOrigin;
    private double length;
    private double price;
    private final int seats;
    private char projectCategory;
    private final HullMaterial hullMaterial;
    private final HullType hullType;

    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;


    public MotorBoat(String brand1, String model1, String countryOfOrigin1, double length1,
                     double price1, int seats1, char projectCategory1, HullMaterial hullMaterial1,
                     HullType hullType1) {
        super(brand1, model1, countryOfOrigin1, length1, price1, seats1, projectCategory1,
                hullMaterial1, hullType1);
        this.brand = brand1;
        this.model = model1;
        this.countryOfOrigin = countryOfOrigin1;
        this.seats = seats1;
        this.hullMaterial = hullMaterial1;
        this.hullType = hullType1;
        this.typeOfFuel = typeOfFuel;
    }


    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public char getProjectCategory() {
        return projectCategory;
    }

    @Override
    public HullMaterial getHullMaterial() {
        return hullMaterial;
    }

    @Override
    public HullType getHullType() {
        return hullType;
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


