package boats;

public enum HullMaterial {
    ALUMINIUM("Aluminium"),
    DREWNO("Drewno"),
    HYPALON("HYPALON"),
    PCW("PCW"),
    STAL("STAL"),
    WŁÓKNO_SZKLANE("WŁÓKNO_SZKLANE"),
    ŻELAZOCEMENT("ŻELAZOCEMENT"),
    INNE("INNE");

    private String name;

    HullMaterial(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
