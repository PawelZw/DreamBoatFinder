package director;

import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

public class Application extends Menu{


    private static final String authorBio = "author: Paweł Zwolicki\ndate:12.09.2022\nversion 1.0";



    public Application() {
        super("Options");
        add(new SearchBoat());
        add(new MenuItem("Buy boat", null));
        add(new MenuItem("About us", new ICommand() {
            @Override
            public void execute() {
                System.out.println(authorBio);
            }
        }));

        addExitOption("Exit");

    }

    public static void main(String[] args) {
        Application application = new Application();
        application.execute();

    }




}
