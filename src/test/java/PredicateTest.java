import boats.Boat;
import buildersmotorboats.MotorBoatBuilder;
import filters.*;
import motorboats.MotorBoat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PredicateTest {

    @ParameterizedTest
    @CsvSource(value={"0,200,150,true","0,200,201,false"})//dane brzegowe czyli np 199 1 itp
    public void speedRangeTest(int minSpeed, int maxSpeed, int boatsSpeed, boolean result) {
        SpeedRange speedRange = new SpeedRange(minSpeed, maxSpeed);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setMaxSpeed(boatsSpeed);

        MotorBoat motorboat = builder.getResult();

       // Assertions.assertTrue(speedRange.predict(motorboat));
        Assertions.assertEquals(result, speedRange.predict(motorboat));
    }

    @ParameterizedTest
    @CsvSource(value={"0,10,6,true","0,10,11,false"})
    public void seatsRangeTest(int minSeatsAmount, int maxSeatsAmount, int boatsSeatsAmount, boolean result) {
        SeatsRange seatsRange = new SeatsRange(minSeatsAmount, maxSeatsAmount);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setSeats(boatsSeatsAmount);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, seatsRange.predict(motorboat));
    }
/*
    @ParameterizedTest
    @CsvSource(value={"0,2000,1999,true"})
    public void horsePowerRangeTest(int minEnginePower, int maxEnginePower, int boatsEnginePower, boolean result) {
        HorsePowerRange horsePowerRange = new HorsePowerRange(maxEnginePower, minEnginePower);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setEnginePower(boatsEnginePower);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, horsePowerRange.predict(motorboat));
    }

 */


    @ParameterizedTest
    @CsvSource(value={"0,30,29,true","0,30,31,false"})
    public void lengthRangeTest(double minLenght, double maxLength, double boatsLenght, boolean result) {
        LengthRange lengthRange = new LengthRange(minLenght, maxLength);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setLength(boatsLenght);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, lengthRange.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value={/*"0,1000,500,true",*/"0,1000000,1000001,false"})
    public void priceRangeTest(double minPrice, double maxPrice, double boatsPrice, boolean result) {
        PriceRange priceRange = new PriceRange(maxPrice, minPrice);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setPrice(boatsPrice);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, priceRange.predict(motorboat));

    }

    @ParameterizedTest
    @CsvSource(value={"0,5000,4999,true","0,5000,5001,false"})
    public void weightRangeTest(double minWeight, double maxWeight, double boatsWeight, boolean result) {
        WeightRange weightRange = new WeightRange(minWeight, maxWeight);
        MotorBoatBuilder builder = new MotorBoatBuilder();
        builder.setWeight(boatsWeight);

        MotorBoat motorboat = builder.getResult();
        Assertions.assertEquals(result, weightRange.predict(motorboat));

    }
}
