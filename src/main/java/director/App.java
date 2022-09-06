package director;

import buildersmotorboats.Builder;
import buildersmotorboats.MotorBoatBuilder;
import context.BoatsRepository;
import context.IDbContext;
import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private boolean menuRunning;
    private Menu menu;

    public App() {
        menu = new Menu("options", null);
        menu.add(new MenuItem("Search boat", new SearchBoat()));
        menu.add(new MenuItem("Buy boat", null));
        menu.add(new MenuItem("About us", new ICommand() {
            @Override
            public void execute() {
                System.out.println("author: Paweł Zwolicki ");
            }
        }));
        menu.add(new MenuItem("Exit", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Wyjście z programu ");
                menuRunning = false;

            }
        }));

    }


    public void run() {
        menuRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (menuRunning) {

            System.out.println(menu);
            int option = scanner.nextInt();
            menu.execute(option);
        }
    }

}
