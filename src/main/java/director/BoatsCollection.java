package director;

import boats.Boat;
import buildersmotorboats.MotorBoatBuilder;
import filters.Validator;

import java.util.ArrayList;
import java.util.List;

public class BoatsCollection {

    private List<Boat> boats;

    public BoatsCollection(Director director) {
        boats = new ArrayList<>();
        MotorBoatBuilder motorBoatBuilder = new MotorBoatBuilder();
        director.constructXoBoat(motorBoatBuilder);
        boats.add(motorBoatBuilder.getResult());
        director.constructAxoparBoat(motorBoatBuilder);
        boats.add(motorBoatBuilder.getResult());
        director.construct(motorBoatBuilder, 1 );
        boats.add(motorBoatBuilder.getResult());
        director.construct(motorBoatBuilder,2);
        boats.add(motorBoatBuilder.getResult());
        director.construct(motorBoatBuilder,3);
        boats.add(motorBoatBuilder.getResult());

    }
    public List <Boat> findAll(Validator validator) {
        List <Boat> result = new ArrayList<>();
        for(Boat boat : boats) {
            if(validator.isValid(boat)) {
                result.add(boat);
            }
        }
        return result;
    }

}
