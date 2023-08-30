///*
// //Descripción de la clase: define un objeto que representa un vehículo con atributos como modelo,
//nombre del conductor y tiempo. Proporciona constructores para inicializar estos atributos y métodos para obtener y establecer sus valores.
//También incluye una implementación incompleta del método copy() para copiar objetos y el método toString() para obtener una representación en cadena de un vehículo.
////* @author alejandro.sarria@uao.edu.co, alejandro sarria, Código 2225498
////*  @author jose_ale.burbano@uao.edu.co, jose alejandro burbano, Código 2225498
////*  @author fabian_esteban.lopez@uao.edu.co   ,fabian lopez ,  Código 2216110
////* @date 30 /Agosto/2023
////* @version 1.0

package datos;

import modelo.Base;

public class Vehiculo extends Base {

    private String modeloV;
    private String nombreD;
    private int tiempo;

    public Vehiculo() {
    }

    public Vehiculo(String modeloV, String nombreD, int tiempo) {
        this.modeloV = modeloV;
        this.nombreD = nombreD;
        this.tiempo = tiempo;
    }

    /**
     * Get the value of tiempo
     *
     * @return the value of tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Set the value of tiempo
     *
     * @param tiempo new value of tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Get the value of nombreD
     *
     * @return the value of nombreD
     */
    public String getNombreD() {
        return nombreD;
    }

    /**
     * Set the value of nombreD
     *
     * @param nombreD new value of nombreD
     */
    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    /**
     * Get the value of modeloV
     *
     * @return the value of modeloV
     */
    public String getModeloV() {
        return modeloV;
    }

    /**
     * Set the value of modeloV
     *
     * @param modeloV new value of modeloV
     */
    public void setModeloV(String modeloV) {
        this.modeloV = modeloV;
    }

    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return modeloV + "," + nombreD + "," + tiempo+",";
    }

}
