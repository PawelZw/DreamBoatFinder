package director;

import filters.*;
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

        menu.add(new MenuItem("Country of origin", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type country of origin");
                Scanner scanner = new Scanner(System.in);
                String countryOfOrigin = scanner.nextLine();
                CountryOfOriginEqual countryOfOriginEqual = new CountryOfOriginEqual(countryOfOrigin);
                validator.add(countryOfOriginEqual);

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

        menu.add(new MenuItem("Horse power ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum horse power:");
                Scanner scanner = new Scanner(System.in);
                int minimumEnginePower = scanner.nextInt();
                System.out.println("Type maximum horse power:");
                int maximumEnginePower = scanner.nextInt();
                HorsePowerRange horsePowerRange = new HorsePowerRange(minimumEnginePower, maximumEnginePower);
                validator.add(horsePowerRange);
            }

        }));

        menu.add(new MenuItem("Number of seats ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type number of seats:");
                Scanner scanner = new Scanner(System.in);
                int minimumNumberOfSeats = scanner.nextInt();
                System.out.println("Type maximum number of seats:");
                int maximumNumberOfSeats = scanner.nextInt();
                SeatsRange seatsRange = new SeatsRange(minimumNumberOfSeats, maximumNumberOfSeats);
                validator.add(seatsRange);
            }

        }));

        menu.add(new MenuItem("Speed ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum speed: ");
                Scanner scanner = new Scanner(System.in);
                int minimumSpeed = scanner.nextInt();
                System.out.println("Type maximum speed:");
                int maximumSpeed = scanner.nextInt();
                SpeedRange speedRange = new SpeedRange(minimumSpeed, maximumSpeed);
                validator.add(speedRange);
            }

        }));

        menu.add(new MenuItem("Weight ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum weight: ");
                Scanner scanner = new Scanner(System.in);
                int minimumWeight = scanner.nextInt();
                System.out.println("Type maximum weight: ");
                int maximumWeight = scanner.nextInt();
                WeightRange weightRange = new WeightRange(minimumWeight, maximumWeight);
                validator.add(weightRange);
            }

        }));

        menu.add(new MenuItem("Length ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum length:");
                Scanner scanner = new Scanner(System.in);
                double minimumLength = scanner.nextDouble();
                System.out.println("Type maximum length:");
                double maximumLength = scanner.nextDouble();
                LengthRange lengthRange = new LengthRange(minimumLength, maximumLength);
                validator.add(lengthRange);
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
