//@author fabian_esteban.lopez@uao.edu.co, Fabian Esteban Lopez Arias ,  Código 2216110
//* @author alejandro.sarria@uao.edu.co, alejandro sarria, Código 2225498
//*  @author jose_ale.burbano@uao.edu.co, jose alejandro burbano, Código 2225498
package datos;

import modelo.Base;

/**
 *
 * @author fabian_esteban.lopez
 */
public class Carro extends Base{
    
    private String modeloV;
    private String nombreD;
    private int tiempo;

    public Carro() {
    }

    public Carro(String modeloV, String nombreD, int tiempo) {
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
    public String toString() {
        return "Carro{" + "modeloV=" + modeloV + ", nombreD=" + nombreD + ", tiempo=" + tiempo + '}';
    }

    @Override
    public Base copy() {
        return new Carro(modeloV, nombreD, tiempo);
    }

}
