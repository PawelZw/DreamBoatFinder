package filters;

import boats.Boat;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private List<Predicate>predicates;

    public Validator() {
        predicates = new ArrayList<>();
    }

    public void add(Predicate predicate) {
        predicates.add(predicate);
    }
    public boolean isValid(Boat boat) {

        for(int i = 0; i < predicates.size(); i++ ) {
            if(!predicates.get(i).predict(boat)) {
                return false;
            }
        }
        return true;
    }
}
