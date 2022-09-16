package director;

import filters.*;
import menu.ICommand;
import menu.Menu;
import menu.MenuItem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectFilter extends Menu {

    
    private Validator validator;




    public SelectFilter(Validator validator) {
        super("Choose filter");
        Scanner scanner = new Scanner(System.in);

        this.validator = validator;

        add(new MenuItem("Show applied filters ", new ICommand() {
            @Override
            public void execute() {
                System.out.println(validator);

            }
        }));


       

        add(new MenuItem("Brand", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type brand");
                String brand = scanner.nextLine();
                BrandEqual brandEqual = new BrandEqual(brand);
                validator.add(brandEqual);

            }
        }));
        add(new MenuItem("Model  ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type model");
                String model = scanner.nextLine();
                ModelEqual modelEqual = new ModelEqual(model);
                validator.add(modelEqual);

            }
        }));

        add(new MenuItem("Country of origin", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type country of origin");
                String countryOfOrigin = scanner.nextLine();
                CountryOfOriginEqual countryOfOriginEqual = new CountryOfOriginEqual(countryOfOrigin);
                validator.add(countryOfOriginEqual);

            }
        }));

        add(new MenuItem("Price ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum price:");
                double minimumPrice = scanner.nextDouble();
                System.out.println("Type maximum price:");
                double maximumPrice = scanner.nextDouble();
                PriceRange priceRange = new PriceRange(minimumPrice, maximumPrice);
                validator.add(priceRange);
            }

        }));

        add(new MenuItem("Horse power ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum horse power:");
                int minimumEnginePower = scanner.nextInt();
                System.out.println("Type maximum horse power:");
                int maximumEnginePower = scanner.nextInt();
                HorsePowerRange horsePowerRange = new HorsePowerRange(minimumEnginePower, maximumEnginePower);
                validator.add(horsePowerRange);
            }

        }));

        add(new MenuItem("Number of seats ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type number of seats:");
                int minimumNumberOfSeats = scanner.nextInt();
                System.out.println("Type maximum number of seats:");
                int maximumNumberOfSeats = scanner.nextInt();
                SeatsRange seatsRange = new SeatsRange(minimumNumberOfSeats, maximumNumberOfSeats);
                validator.add(seatsRange);
            }

        }));

        add(new MenuItem("Speed ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum speed: ");
                int minimumSpeed = scanner.nextInt();
                System.out.println("Type maximum speed:");
                int maximumSpeed = scanner.nextInt();
                SpeedRange speedRange = new SpeedRange(minimumSpeed, maximumSpeed);
                validator.add(speedRange);
            }

        }));

        add(new MenuItem("Weight ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum weight: ");
                int minimumWeight = scanner.nextInt();
                System.out.println("Type maximum weight: ");
                int maximumWeight = scanner.nextInt();
                WeightRange weightRange = new WeightRange(minimumWeight, maximumWeight);
                validator.add(weightRange);
            }

        }));

        add(new MenuItem("Length ", new ICommand() {
            @Override
            public void execute() {
                System.out.println("Type minimum length:");
                double minimumLength = scanner.nextDouble();
                System.out.println("Type maximum length:");
                double maximumLength = scanner.nextDouble();
                LengthRange lengthRange = new LengthRange(minimumLength, maximumLength);
                validator.add(lengthRange);
            }

        }));

        addExitOption("Back");
    }
}
