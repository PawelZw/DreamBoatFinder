package filters;

import boats.Boat;

public class BrandEqual implements Predicate {

    private String brand;

    public BrandEqual(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean predict(Boat boat) {

        return boat.getBrand().toLowerCase().equals(brand.toLowerCase());
    }
}
