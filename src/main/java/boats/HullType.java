package boats;

public enum HullType {                       // Public enum classifies the deck type
    MONOHULL("Jednokadłubowiec"),
    KATAMARAN("Katamaran"),
    TRIMARAN("Trimaran");


    private String name;                     //variable defining the name in Polish
    HullType(String name) {this.name = name;}    //constructor

    @Override
    public String toString() { return name;}     //method toString
}
