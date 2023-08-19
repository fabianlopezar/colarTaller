/**
 *
 * @author fabian_esteban.lopez
 */
package modelo;

import java.util.LinkedList;

public class Cola<T extends Base> {

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
