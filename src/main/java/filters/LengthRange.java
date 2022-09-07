package filters;

import boats.Boat;

public class LengthRange implements Predicate {      //length of boat filtering class

    private double minLenght;
    private double maxLength;

    public LengthRange(double minLenght, double maxLength) {
        this.minLenght = minLenght;
        this.maxLength = maxLength;
    }

    @Override
    public boolean predict(Boat boat) {
        return(boat.getPrice() <= maxLength && boat.getPrice() >= minLenght);
    }
}
