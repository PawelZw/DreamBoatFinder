# dream-boat-finder

🔥  The program searches for specific boat models based on the given parameters.

💡 Technologies
  Java

# Application description

## The application is used to search for boats in the database based on specific filters. The application starts in the console. With the Search boat option, we go to the selection screen. with option "Add filter"



### In the picture we can see the main menu in the console with the following functions: Search boat, Buy boat (currently unavailable), About us, and Exit

![menu boat](https://user-images.githubusercontent.com/108124357/211158673-b5d0377e-d67e-4589-a3fb-204757d26912.jpg)

### In the next picture we can see a submenu in which we can select individual search criteria:
- Brand
- Model  
- Country of origin
- Price 
- Horse power 
- Number of seats 
- Speed 
- Weight 
- Length 

![2023-01-07 14 21 47](https://user-images.githubusercontent.com/108124357/211158672-d3619a1a-ae21-48c6-a899-81a8653e137c.jpg)

### In the next picture we can see the result of the search in the form of two boats that meet the search criteria. The given criterion was the country of origin - the USA

![menu plus wynik](https://user-images.githubusercontent.com/108124357/211158675-4dd7e352-590c-4d0f-98fb-d3fb4bca360f.jpg)


# Unit tests

In addition, the application has been equipped with a series of unit tests to check the functionality of predicates.

In the photo below, we observe a series of correctly performing tests.

![testy](https://user-images.githubusercontent.com/108124357/211158676-27fc7bf1-e7ef-4c2d-b48a-9b710b988652.jpg)



# Code snippet describing some sample unit tests:


 ```
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

   ```

Conclusions: I wrote this code to improve my java programming skills. I am passionate about motor boats, that's why I wanted to make an application on this topic. The application still needs a lot of work, so I will be grateful for all comments.

 
 

🙋‍♂️ Feel free to contact me
Write sth nice ;) Find me on pawelzwolicki@gmail.com

 
👏 Thanks 
