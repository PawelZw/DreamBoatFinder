package director;

public class Car {
    private String brand;
    private String name;
    private int year;

    public Car(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;

        System.out.println("Co bedzie?? " + this);
    }

    @Override
    public String toString() {
        return String.format("%s %s year: %d", brand, name, year);
    }
}
