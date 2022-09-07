package filters;

import boats.Boat;

public class ModelEqual implements Predicate {    //boats model filtering class

    private String model;

    public ModelEqual(String model) {
        this.model = model;
    }

    @Override
    public boolean predict(Boat boat) {
        return boat.getModel().toLowerCase().equals(model.toLowerCase());
    }
}
