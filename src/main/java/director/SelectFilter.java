package director;

import filters.BrandEqual;
import filters.ModelEqual;
import filters.PriceRange;
import filters.Validator;
import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

import java.util.Scanner;

public class SelectFilter implements ICommand {

    private boolean menuRunning;
    private Menu menu;
    private Validator validator;


    public SelectFilter(Validator validator) {
        this.validator = validator;
        menu = new Menu("Choose filter", null);

        menu.add(new MenuItem("Brand", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type brand");
                Scanner scanner = new Scanner(System.in);
                String brand = scanner.nextLine();
                BrandEqual brandEqual = new BrandEqual(brand);
                validator.add(brandEqual);

            }
        }));
        menu.add(new MenuItem("Model  ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type model");
                Scanner scanner = new Scanner(System.in);
                String model = scanner.nextLine();
                ModelEqual modelEqual = new ModelEqual(model);
                validator.add(modelEqual);

            }
        }));

        menu.add(new MenuItem("Price ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum price:");
                Scanner scanner = new Scanner(System.in);
                double minimumPrice = scanner.nextDouble();
                System.out.println("Type maximum price:");
                double maximumPrice = scanner.nextDouble();
                PriceRange priceRange = new PriceRange(minimumPrice, maximumPrice);
                validator.add(priceRange);
            }

        }));
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
