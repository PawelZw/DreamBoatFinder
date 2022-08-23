package filters;

import boats.Boat;

public class WeightRange implements Predicate {

    private double minWeight;
    private double maxWeight;

    public WeightRange(double minWeight, double maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    @Override
    public boolean predict(Boat boat) {
        return(boat.getPrice() <= maxWeight && boat.getPrice() >= minWeight);
    }
}
