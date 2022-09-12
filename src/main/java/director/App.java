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

public class App extends Menu{


    private static final String authorBio = "author: Paweł Zwolicki\ndate:12.09.2022\nversion 1.0";



    public App() {
        super("Options");
        add(new SearchBoat());
        add(new MenuItem("Buy boat", null));
        add(new MenuItem("About us", new ICommand() {
            @Override
            public void execute() {
                System.out.println(authorBio);
            }
        }));
        add(new MenuItem("Exit", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Wyjście z programu ");
                menuRunning = false;

            }
        }));

    }




}
