package director;

import filters.Validator;
import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

import java.util.Scanner;

public class SearchBoat implements ICommand {

    private boolean menuRunning;
    private Menu menu;
    private Validator validator;

    public SearchBoat() {
        this.validator = new Validator();
        menu = new Menu("Search boat", null);

        menu.add(new MenuItem("Add filter", new SelectFilter(validator)));
        menu.add(new MenuItem("Search ", null));
        menu.add(new MenuItem("Back ", new ICommand() {
            @Override
            public void execute() {
                menuRunning = false;
            }
        }));

    }


    @Override
    public void execute() {

        menuRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (menuRunning) {

            System.out.println(menu);
            int option = scanner.nextInt();
            menu.execute(option);
        }
    }
}
