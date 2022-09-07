package filters;

import boats.Boat;

public class SeatsRange implements Predicate {        //amount of seats filtering class

    private int minSeatsAmount;
    private int maxSeatsAmount;

    public SeatsRange(int minSeatsAmount, int maxSeatsAmount) {
        this.minSeatsAmount = minSeatsAmount;
        this.maxSeatsAmount = maxSeatsAmount;
    }


    @Override
    public boolean predict(Boat boat) {
        return(boat.getPrice() <= maxSeatsAmount && boat.getPrice() >= minSeatsAmount);
    }
}
