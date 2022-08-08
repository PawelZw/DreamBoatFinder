package director;

import boats.HullMaterial;
import buildersmotorboats.Builder;

public class Director {

        public void constructXoBoat(Builder builder) {
                builder.setBrand("XO");
                builder.setCountryOfOrigin("Finland");
                builder.setEnginePower(450);
                builder.setHullMaterial(HullMaterial.ALUMINIUM);
                builder.setLength(8.8);
                builder.setModel("DFNDR 9");
                builder.setProjectCategory('B');
        }
        public void constructBaylinerBoat(Builder builder) {
                builder.setBrand("Bayliner");
                builder.setModel("VR5 Cuddy");
                builder.setLength(6.23);
                builder.setProjectCategory('C');
                builder.setHullMaterial(HullMaterial.WŁÓKNO_SZKLANE);
                builder.setEnginePower(200);
                builder.setCountryOfOrigin("USA");
        }
}
