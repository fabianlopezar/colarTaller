// @author INTEL i 7
package controlador;

import datos.Vehiculo;

import java.util.Random;

public class FactoryVehiculo {

    private static Random random = new Random();

    public static Vehiculo create() {

        int randomYear = (int) (Math.random() * (2024 - 2000 + 1) + 2000);
        int tiempo = (int) (Math.random() * (5 - 1 + 1) + 1);

        String modeloV = String.valueOf(randomYear);
        String nombreD = "David";
        Vehiculo v = new Vehiculo(modeloV, nombreD, tiempo);
        return v;
    }

}
