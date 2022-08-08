package director;

import boats.Manual;
import buildersmotorboats.MotorBoatBuilder;
import buildersmotorboats.MotorBoatManualBuilder;
import motorboats.MotorBoat;

public class Application {
    public static void main(String[] args) {

        Director director = new Director();

        MotorBoatBuilder builder = new MotorBoatBuilder();
        director.constructXoBoat(builder);

        MotorBoat motorBoat = builder.getResult();
        System.out.println("Boat built:\n" + motorBoat.getHullMaterial());

        MotorBoatManualBuilder motorBoatManualBuilder = new MotorBoatManualBuilder();

        director.constructXoBoat(motorBoatManualBuilder);
        Manual motorBoatManual = motorBoatManualBuilder.getResult();
        System.out.println("\nBoat manual built:\n" + motorBoatManual.print());
    }
}
