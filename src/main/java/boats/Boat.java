package boats;

public class Boat {
    private final String brand;
    private final String model;
    private final String countryOfOrigin;
    private double length;
    private double price;
    private double weight;
    private final int seats;
    private char projectCategory;
    private final HullMaterial hullMaterial;
    private final HullType hullType;
    private final int maxSpeed;

    public Boat(String brand, String model, String countryOfOrigin, double length, double price,
                double weight, int seats, char projectCategory, HullMaterial hullMaterial, HullType hullType,
                int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
        this.length = length;
        this.price = price;
        this.weight = weight;
        this.seats = seats;
        this.projectCategory = projectCategory;
        this.hullMaterial = hullMaterial;
        this.hullType = hullType;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public int getSeats() {
        return seats;
    }

    public char getProjectCategory() {
        return projectCategory;
    }

    public HullMaterial getHullMaterial() {
        return hullMaterial;
    }

    public HullType getHullType() {
        return hullType;
    }
    public int getMaxSpeed() { return maxSpeed; }
}
