package filters;

import boats.Boat;

public class CountryOfOriginEqual implements Predicate {

    private String countryOfOrigin;

    public CountryOfOriginEqual(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public boolean predict(Boat boat) {
        return  boat.getCountryOfOrigin().toLowerCase().equals(countryOfOrigin.toLowerCase());
    }
}
