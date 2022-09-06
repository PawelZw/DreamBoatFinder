package boats;

public enum HullMaterial {                  //Public enum classifies the deck material
    ALUMINUM("Aluminium"),
    WOOD("Drewno"),
    HYPALON("Hypalon"),
    PVC("PCW"),
    STEEL("Stal"),
    FIBERGLASS("Włókno szklane"),
    FERROCEMENT("Żelazocement"),
    OTHERS("Inne");

    private String name;                     //variable defining the name in Polish

    HullMaterial(String name) {
        this.name = name;
    }   //constructor

    @Override
    public String toString() {
        return name;
    }         //method toString
}
