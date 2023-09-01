///*
// Descripción de la clase:la clase Cola implementa una estructura de datos de cola utilizando una lista enlazada. 
//Los métodos encolar, desencolar y estaVacia permiten manipular la cola,
//y el método toString proporciona una representación en cadena de la cola actual.
//Se espera que los elementos almacenados en esta cola sean subclases de Base.
//@author fabian_esteban.lopez@uao.edu.co, Fabian Esteban Lopez Arias ,  Código 2216110
//* @author alejandro.sarria@uao.edu.co, alejandro sarria, Código 2225498
//*  @author jose_ale.burbano@uao.edu.co, jose alejandro burbano, Código 2225498
//* @date 30 /Agosto/2023
//* @version 1.0

package modelo;

import java.util.LinkedList;

public class Cola<T extends Base> {
/**
* Descripción del método: encolar() Agrega el elemento especificado al final de la cola 
* Descripción del método: desencolar() Remueve y devuelve el primer elemento de la cola
* Descripción del método: estaVacia() Verifica si la cola está vacía.

* @param colaVehiculos// Obtiene la cola de vehiculos generada


* @return retorna la nueva cola
*/ 

    LinkedList<T> colaVehiculos;

    public Cola() {
        colaVehiculos = new LinkedList<>();
    }

    public void encolar(T elemento) {
        colaVehiculos.addLast(elemento);
    }

    public T desencolar() {
        return colaVehiculos.removeFirst();
    }

    public boolean estaVacia() {
        return colaVehiculos.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (T elemento : colaVehiculos) {
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
