package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuItem {

    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String title, ICommand command) {
        super(title, command);
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle()).append("\n");
        for (int i = 0; i < menuItems.size(); i++) {
            sb.append(i + ". ").append( menuItems.get(i).getTitle()).append("\n");

        }
        return sb.toString();
    }

    public void execute(int number) {
        menuItems.get(number).getCommand().execute();
    }
}
