package director;

import filters.Validator;
import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

import java.util.Scanner;

public class SearchBoat extends Menu {


    private Validator validator;

    public SearchBoat() {
        super("Search boat");
        this.validator = new Validator();

        add(new MenuItem("Add filter", new SelectFilter(validator)));
        add(new MenuItem("Search ", new SubmitSearch(validator)));
        addExitOption("Back");

    }

}
