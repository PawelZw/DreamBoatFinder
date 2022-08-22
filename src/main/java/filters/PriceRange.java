package filters;

import boats.Boat;

public class PriceRange implements Predicate{

   private double maxPrice;
   private double minPrice;

    public PriceRange(double maxPrice, double minPrice) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    @Override
    public boolean predict(Boat boat) {

        return(boat.getPrice() <= maxPrice && boat.getPrice() >= minPrice);
    }
}
