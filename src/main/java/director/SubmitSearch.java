package director;

import context.BoatsRepository;
import context.DbContext;
import filters.Validator;
import menu.ICommand;

public class SubmitSearch implements ICommand {
    private Validator validator;

    public SubmitSearch(Validator validator) {
        this.validator = new Validator();
    }

    @Override
    public void execute() {
        DbContext db = new DbContext();
        db.connect();
        BoatsRepository repository = new BoatsRepository(db);

        db.close();

    }
}
