package filters;

import boats.Boat;

public class SpeedRange implements Predicate {       //boats speed filtering class

    private int minSpeed;
    private int maxSpeed;

    public SpeedRange(int minSpeed, int maxSpeed) {
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean predict(Boat boat) {
        return(boat.getMaxSpeed() <= maxSpeed && boat.getMaxSpeed() >= minSpeed);
    }
}
