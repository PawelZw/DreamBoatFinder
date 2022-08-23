package filters;

import boats.Boat;

public class SpeedRange implements Predicate {

    private int minSpeed;
    private int maxSpeed;

    public SpeedRange(int minSpeed, int maxSpeed) {
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean predict(Boat boat) {
        return(boat.getPrice() <= maxSpeed && boat.getPrice() >= minSpeed);
    }
}
