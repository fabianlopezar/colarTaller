
////Descripción de la clase: En esta clase se crean los vehiculos de manera automatica con un una variable ramdon 
//la cual esta programada para crear cada vehiculo con un modelo entre 2000 y 2024 y le da un nombre y un tiempo al objeto en cuestion.
///@author fabian_esteban.lopez@uao.edu.co, Fabian Esteban Lopez Arias ,  Código 2216110
//* @author alejandro.sarria@uao.edu.co, alejandro sarria, Código 2225498
//*  @author jose_ale.burbano@uao.edu.co, jose alejandro burbano, Código 2225498
//* @date 30 /Agosto/2023
//* @version 1.0

package controlador;

import datos.Carro;


import java.util.Random;

public class FactoryVehiculo {

    private static Random random = new Random();

    public static Carro create() {

        int randomYear = (int) (Math.random() * (2024 - 2000 + 1) + 2000);
        int tiempo = (int) (Math.random() * (5 - 1 + 1) + 1);

        String modeloV = String.valueOf(randomYear);
        String nombreD = "David";
        Carro v = new Carro(modeloV, nombreD, tiempo);
        return v;
    }

}
