package buildersmotorboats;

import boats.HullMaterial;
import boats.HullType;
import motorboats.TypeOfFuel;

public interface Builder {

    void setBrand(String brand);
    void setModel(String model);
    void setCountryOfOrigin(String countryOfOrigin);
    void setLength(double length);
    void setPrice(double price);
    void setSeats(int seats);
    void setProjectCategory(char projectCategory);
    void setHullMaterial(HullMaterial hullMaterial);
    void setHullType(HullType hullType);
    void setWeight(double weight);

   void setTypeOfFuel(TypeOfFuel typeOfFuel);
   void setEnginePower(int enginePower);
   void setIsThereACabin(boolean isThereACabin);
}
