package director;

import buildersmotorboats.MotorBoatBuilder;
import motorboats.MotorBoat;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        MotorBoatBuilder builder = new MotorBoatBuilder();
        director.constructXoBoat(builder);

        MotorBoat motorBoat = builder.getResult();
        System.out.println("Boat built:\n" + motorBoat.getHullMaterial());
    }
}
