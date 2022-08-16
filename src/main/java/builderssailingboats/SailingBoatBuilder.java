package builderssailingboats;

import boats.HullMaterial;
import boats.HullType;
import boats.Manual;

public class SailingBoatBuilder implements Builder {

    private String brand;
    private String model;
    private String countryOfOrigin;
    private double length;
    private double price;
    private int seats;
    private char projectCategory;
    private HullMaterial hullMaterial;
    private HullType hullType;


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
    public Manual getResult() {
        return new Manual(brand, model, countryOfOrigin, length, price, seats, projectCategory,
                hullMaterial, hullType,);

    }
}
