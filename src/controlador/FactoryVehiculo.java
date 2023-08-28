/**
 *
 * @author INTEL i 7
 */
package controlador;

import datos.Vehiculo;

public class FactoryVehiculo {

    public static Vehiculo create() {
        int minYear = 2000;
        int maxYear = 2024;
        int randomYear = (int) (Math.random() * (maxYear - minYear + 1));
        String modeloV = String.valueOf(randomYear);
        String nombreD = "David";
        boolean estadoVehiculo = true;
        int minTime = 1;
        int maxTime = 5;
        int tiempo = (int) (Math.random() * (maxTime - minTime + 1));
        Vehiculo v = new Vehiculo(modeloV, nombreD, estadoVehiculo, tiempo);
        return v;
    }

}
