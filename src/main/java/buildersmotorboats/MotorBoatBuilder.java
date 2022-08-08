package buildersmotorboats;

import boats.HullMaterial;
import boats.HullType;
import motorboats.MotorBoat;
import motorboats.TypeOfFuel;

public class MotorBoatBuilder implements Builder {

    private String brand1;
    private String model1;
    private String countryOfOrigin1;
    private double length1;
    private double price1;
    private int seats1;
    private char projectCategory1;
    private HullMaterial hullMaterial1;
    private HullType hullType1;

    private TypeOfFuel typeOfFuel;
    private int enginePower;
    private boolean isThereACabin;


    @Override
    public void setBrand(String brand1) {


    }

    @Override
    public void setModel(String model1) {

    }

    @Override
    public void setCountryOfOrigin(String countryOfOrigin1) {

    }

    @Override
    public void setLength(double length1) {

    }

    @Override
    public void setPrice(double price1) {

    }

    @Override
    public void setSeats(int seats1) {

    }

    @Override
    public void setProjectCategory(char projectCategory1) {

    }

    @Override
    public void setHullMaterial(HullMaterial hullMaterial1) {

    }

    @Override
    public void setHullType(HullType hullType1) {

    }

    @Override
    public void setTypeOfFuel(TypeOfFuel typeOfFuel1) {

    }

    @Override
    public void setEnginePower(int enginePower1) {

    }

    @Override
    public void setIsThereACabin(boolean isThereACabin1) {

    }

    public MotorBoat getResult() {
        return new MotorBoat(brand1, model1, countryOfOrigin1,length1,price1,seats1,
                projectCategory1,hullMaterial1,hullType1);
    }
}

