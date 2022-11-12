import buildersmotorboats.MotorBoatBuilder;
import filters.*;
import motorboats.MotorBoat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PredicateTest {

    @ParameterizedTest
    @CsvSource(value = {"0,200,150,true", "0,200,201,false"})
    public void speedRangeTest(int minSpeed, int maxSpeed, int boatsSpeed, boolean result) {
        SpeedRange speedRange = new SpeedRange(minSpeed, maxSpeed);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setMaxSpeed(boatsSpeed);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, speedRange.predict(motorboat));
    }

    @ParameterizedTest
    @CsvSource(value = {"0,10,6,true", "0,10,11,false"})
    public void seatsRangeTest(int minSeatsAmount, int maxSeatsAmount, int boatsSeatsAmount, boolean result) {
        SeatsRange seatsRange = new SeatsRange(minSeatsAmount, maxSeatsAmount);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setSeats(boatsSeatsAmount);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, seatsRange.predict(motorboat));
    }

    @ParameterizedTest
    @CsvSource(value = {"0,2000,1999,true"})
    public void horsePowerRangeTest(int minEnginePower, int maxEnginePower, int boatsEnginePower, boolean result) {
        HorsePowerRange horsePowerRange = new HorsePowerRange(minEnginePower, maxEnginePower);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setEnginePower(boatsEnginePower);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, horsePowerRange.predict(motorboat));
    }


    @ParameterizedTest
    @CsvSource(value = {"0,30,29,true", "0,30,31,false"})
    public void lengthRangeTest(double minLenght, double maxLength, double boatsLenght, boolean result) {
        LengthRange lengthRange = new LengthRange(minLenght, maxLength);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setLength(boatsLenght);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, lengthRange.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value = {"0,1000,500,true", "0,1000000,1000001,false"})
    public void priceRangeTest(double minPrice, double maxPrice, double boatsPrice, boolean result) {
        PriceRange priceRange = new PriceRange(minPrice, maxPrice);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setPrice(boatsPrice);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, priceRange.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value = {"0,5000,4999,true", "0,5000,5001,false"})
    public void weightRangeTest(double minWeight, double maxWeight, double boatsWeight, boolean result) {
        WeightRange weightRange = new WeightRange(minWeight, maxWeight);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setWeight(boatsWeight);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, weightRange.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value = {"XO,XO,true", "XO,xo,true"})
    public void brandEqualTest(String brand, String brandSearch, boolean result) {
        BrandEqual brandEqual = new BrandEqual(brandSearch);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setBrand(brandSearch);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, brandEqual.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value = {"DFNDR9,DFNDR9,true", "DFNDR9,dfndr9,true"})
    public void modelEqualTest(String model, String modelSearch, boolean result) {
        ModelEqual modelEqual = new ModelEqual(modelSearch);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setModel(modelSearch);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, modelEqual.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value = {"Poland,Poland,true", "Poland,POLAND,true"})
    public void countryOfOriginEqualTest(String countryOfOrigin, String countryOfOriginSearch, boolean result) {
        CountryOfOriginEqual countryOfOriginEqual = new CountryOfOriginEqual(countryOfOriginSearch);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setCountryOfOrigin(countryOfOriginSearch);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, countryOfOriginEqual.predict(motorboat));

    }
}
