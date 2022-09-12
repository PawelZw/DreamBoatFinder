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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public ICommand getCommand() {
        return command;
    }
}
