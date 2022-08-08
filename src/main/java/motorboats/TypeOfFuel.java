package motorboats;

public enum TypeOfFuel {
    PETROL("Benzyna"),
    DIESEL("Diesel"),
    ELECTRIC("Elektryczny");

    private String name;

    TypeOfFuel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
