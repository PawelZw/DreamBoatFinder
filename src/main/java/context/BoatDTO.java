package context;

public class BoatDTO {
    private int id;
    private String brand;
    private String countryOfOrigin;
    private int enginePower;

    public BoatDTO(int id, String brand, String countryOfOrigin, int enginePower) {
        this.id = id;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.enginePower = enginePower;
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
}