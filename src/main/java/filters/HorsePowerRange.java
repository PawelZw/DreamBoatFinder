package filters;

import boats.Boat;
import motorboats.MotorBoat;

public class HorsePowerRange implements Predicate  {        //horsepower filtering class

    private int minEnginePower;
    private int maxEnginePower;

    public HorsePowerRange(int minEnginePower, int maxEnginePower) {
        this.minEnginePower = minEnginePower;
        this.maxEnginePower = maxEnginePower;
    }

    @Override
    public boolean predict(Boat boat) {
        if (boat instanceof MotorBoat) {
            MotorBoat motorboat = (MotorBoat) boat;
            return (motorboat.getEnginePower() <= maxEnginePower && motorboat.getEnginePower() >= minEnginePower);
        } else {
            return false;
        }
    }
}
