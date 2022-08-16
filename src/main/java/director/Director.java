package director;

import boats.HullMaterial;
import buildersmotorboats.Builder;

public class Director {
        public void construct(Builder builder, String boatName)
        {

        }

        public void constructXoBoat(Builder builder) {
                builder.setBrand("XO");
                builder.setCountryOfOrigin("Finland");
                builder.setEnginePower(450);
                builder.setHullMaterial(HullMaterial.ALUMINUM);
                builder.setLength(8.8);
                builder.setModel("DFNDR 9");
                builder.setProjectCategory('B');
        }
        public void constructBaylinerBoat(Builder builder) {
                builder.setBrand("Bayliner");
                builder.setModel("VR5 Cuddy");
                builder.setLength(6.23);
                builder.setProjectCategory('C');
                builder.setHullMaterial(HullMaterial.FIBERGLASS);
                builder.setEnginePower(200);
                builder.setCountryOfOrigin("USA");
        }
        public void constructAxoparBoat(Builder builder) {
                builder.setBrand("Axopar");
                builder.setCountryOfOrigin("Finland");
                builder.setProjectCategory('B');
                builder.setLength(11.5);
                builder.setModel("37 XC Cross Cabin");
                builder.setHullMaterial(HullMaterial.FIBERGLASS);
                builder.setWeight(3770);
                builder.setPrice(108680);

        }
}
