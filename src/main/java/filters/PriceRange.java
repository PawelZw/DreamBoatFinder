package filters;

import boats.Boat;

public class PriceRange implements Predicate{     //boats price filtering class

   private double maxPrice;
   private double minPrice;

    public PriceRange(double minPrice, double maxPrice) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    @Override
    public boolean predict(Boat boat) {

        return(boat.getPrice() <= maxPrice && boat.getPrice() >= minPrice);
    }
}
