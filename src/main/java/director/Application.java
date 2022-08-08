package director;

import buildersmotorboats.MotorBoatBuilder;
import motorboats.MotorBoat;

public class Application {
    public static void main(String[] args) {

        Car c = new Car("Daewoo", "matiz", 1999);
        System.out.println(c);


        Director director = new Director();

        MotorBoatBuilder builder = new MotorBoatBuilder();
        director.constructXoBoat(builder);

        MotorBoat motorBoat = builder.getResult();
        System.out.println("Boat built:\n" + motorBoat.getHullMaterial());
    }
}
