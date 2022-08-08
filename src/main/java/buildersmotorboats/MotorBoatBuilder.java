package buildersmotorboats;

import boats.HullMaterial;
import boats.HullType;
import motorboats.MotorBoat;
import motorboats.TypeOfFuel;

public class MotorBoatBuilder implements Builder {

    private String brand;
    private String model;
    private String countryOfOrigin;
    private double length;
    private double price;
    private double weight;
    private int seats;
    private char projectCategory;
    private HullMaterial hullMaterial;
    private HullType hullType;

    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setProjectCategory(char projectCategory) {
        this.projectCategory = projectCategory;
    }

    @Override
    public void setHullMaterial(HullMaterial hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    @Override
    public void setHullType(HullType hullType) {
        this.hullType = hullType;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void setIsThereACabin(boolean thereACabin) {
        isThereACabin = thereACabin;
    }

    public MotorBoat getResult() {
        return new MotorBoat(brand, model, countryOfOrigin,length,price,seats,
                projectCategory,hullMaterial,hullType, typeOfFuel, enginePower, isThereACabin, weight);
    }
}

