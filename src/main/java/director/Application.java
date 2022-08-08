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
        System.out.println("Brand: " + motorBoat.getBrand());
        System.out.println("Model: " + motorBoat.getModel());
        System.out.println("Length: "+ motorBoat.getLength());
        System.out.println("Price: " + motorBoat.getPrice());
        System.out.println("Max speed: " + motorBoat.getMaxSpeed());
        if(motorBoat.getMaxSpeed() == 0) {
            System.out.println("Max speed: NO DATA");
        }
        System.out.println("Count of seats: " + motorBoat.getSeats());
        System.out.println("Project category: " + motorBoat.getProjectCategory());





        MotorBoatManualBuilder manualBuilder = new MotorBoatManualBuilder();

        director.constructXoBoat(manualBuilder);
        Manual motorBoatManual = manualBuilder.getResult();
        System.out.println("\nBoat manual built:\n" + motorBoatManual.print());
    }
}
