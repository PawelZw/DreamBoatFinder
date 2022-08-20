package director;

import boats.Manual;
import buildersmotorboats.MotorBoatBuilder;
import buildersmotorboats.MotorBoatManualBuilder;
import context.BoatDTO;
import context.BoatsRepository;
import context.DbContext;
import motorboats.MotorBoat;


public class Application {
    public static void main(String[] args) {
        DbContext db = new DbContext();
        db.connect();
        BoatsRepository repository = new BoatsRepository(db);
        BoatDTO boat = repository.get(1);
        System.out.println(boat.getBrand());

        Director director = new Director(repository);

        MotorBoatBuilder builder = new MotorBoatBuilder();
        director.construct(builder, 1);

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

        db.close();
    }
}
