package boats;

public enum HullType {                       // Public enum classifies the deck type
    MONOHULL("Jednokadłubowiec"),
    KATAMARAN("Katamaran"),
    TRIMARAN("Trimaran");


    private String name;
    HullType(String name) {this.name = name;}

    @Override
    public String toString() { return name;}
}
