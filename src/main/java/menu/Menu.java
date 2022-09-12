package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem implements ICommand {

    protected boolean menuRunning;

    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String title) {
        super(title, null);
        setCommand(this);
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle()).append("\n");
        for (int i = 0; i < menuItems.size(); i++) {
            sb.append(i + ". ").append(menuItems.get(i).getTitle()).append("\n");

        }
        return sb.toString();
    }

    public void execute(int number) {
        menuItems.get(number).getCommand().execute();
    }


    @Override
    public void execute() {
        menuRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (menuRunning) {

            System.out.println(this);
            int option = scanner.nextInt();
            execute(option);

        }
    }
}
