package buildersmotorboats;

import boats.HullMaterial;
import boats.HullType;
import motorboats.TypeOfFuel;

public class MotorBoatManualBuilder implements Builder{

    private String brand;
    private String model;
    private String countryOfOrigin;
    private double length;
    private double price;
    private int seats;
    private char projectCategory;
    private HullMaterial hullMaterial;
    private HullType hullType;

    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;

    @Override
    public void setBrand(String brand) {

    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public void setCountryOfOrigin(String countryOfOrigin) {

    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setProjectCategory(char projectCategory) {

    }

    @Override
    public void setHullMaterial(HullMaterial hullMaterial) {

    }

    @Override
    public void setHullType(HullType hullType) {

    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {

    }

    @Override
    public void setEnginePower(int enginePower) {

    }

    @Override
    public void setIsThereACabin(boolean isThereACabin) {

    }
}
