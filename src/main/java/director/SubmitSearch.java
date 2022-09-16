package director;

import boats.Boat;
import context.BoatsRepository;
import context.DbContext;
import filters.Validator;
import menu.ICommand;

import java.util.List;

public class SubmitSearch implements ICommand {
    private Validator validator;

    public SubmitSearch(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void execute() {
        DbContext db = new DbContext();
        db.connect();
        BoatsRepository repository = new BoatsRepository(db);
        Director director = new Director(repository);
        BoatsCollection boatsCollection = new BoatsCollection(director);
        List<Boat> boats = boatsCollection.findAll(validator);
        for(Boat boat : boats){
        System.out.println(boat);
        }
        db.close();

    }
}
