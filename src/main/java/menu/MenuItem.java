package menu;

public class MenuItem {

    private String title;
    private ICommand command;

    public MenuItem(String title, ICommand command) {
        this.title = title;
        this.command = command;
    }

    public String getTitle() {
        return title;
    }

    public ICommand getCommand() {
        return command;
    }
}
