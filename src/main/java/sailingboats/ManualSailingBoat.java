package sailingboats;

import boats.HullMaterial;
import boats.HullType;
import boats.Manual;

public class ManualSailingBoat extends Manual {

    private final String brand;
    private final String model;
    private final String countryOfOrigin;
    private double length;
    private double price;
    private final int seats;
    private char projectCategory;
    private final HullMaterial hullMaterial;
    private final HullType hullType;
    private final int maxSpeed;

    public ManualSailingBoat(String brand1, String model1, String countryOfOrigin1, double length1,
                             double price1, int seats1, char projectCategory1, HullMaterial hullMaterial,
                             HullType hullType1, String brand, String model, String countryOfOrigin,
                             double length, double price, int seats, char projectCategory,
                             HullMaterial hullMaterial1, HullType hullType, int maxSpeed) {
        super(brand, model, countryOfOrigin, length, price, seats, projectCategory, hullMaterial, hullType, maxSpeed);
        this.brand = brand;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
        this.length = length;
        this.price = price;
        this.seats = seats;
        this.projectCategory = projectCategory;
        this.hullMaterial = hullMaterial;
        this.hullType = hullType;
        this.maxSpeed = maxSpeed;
    }
}

