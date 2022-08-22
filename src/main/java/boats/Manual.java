package boats;

public class Manual {
    private final String brand;                            // final variables
    private final String model;
    private final String countryOfOrigin;
    private final double length;
    private final double price;
    private final int seats;
    private final char projectCategory;
    private final HullMaterial hullMaterial;
    private final HullType hullType;
    private final int maxSpeed;

    public Manual(String brand, String model, String countryOfOrigin, double length, double price,
                  int seats, char projectCategory, HullMaterial hullMaterial, HullType hullType, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
        this.length = length;
        this.price = price;
        this.seats = seats;
        this.projectCategory = projectCategory;
        this.hullMaterial = hullMaterial;
        this.hullType = hullType;
        this.maxSpeed = maxSpeed;                                // Manual constructor
    }

    public String print() {                                      //method printing boat info
        String info = " ";
        info += "Type: " + hullType+ "\n";
        info += "Brand: " + brand + "\n";
        info += "Model: " + model + "\n";
        info += "Length: " + length + "\n";
        info += "Price: " + price + "\n";
        info += "Max speed: " + maxSpeed + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Project category: " + projectCategory + "\n";
        return info;
    }


    }



