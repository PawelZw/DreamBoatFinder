package context;

public class BoatDTO {
    private int id;
    private String brand;
    private String countryOfOrigin;
    private int enginePower;
    private double length;
    private String model;

    public BoatDTO(int id, String brand, String countryOfOrigin, int enginePower, double length, String model) {
        this.id = id;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.enginePower = enginePower;
        this.length = length;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public double getLength() {
        return length;
    }

    public String getModel() {
        return model;
    }
}