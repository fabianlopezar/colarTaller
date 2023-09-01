///*
// Descripción de la clase: Esta clase proporciona una estructura común para implementar la operación de copia en sus subclases. La clase contiene un método abstracto copy(),
//que debe ser implementado por las subclases para definir cómo se debe realizar la copia de objetos específicos.
// la clase Base facilita la creación de objetos copiados personalizados en las clases que heredan de ella.
//@author fabian_esteban.lopez@uao.edu.co, Fabian Esteban Lopez Arias ,  Código 2216110
//* @author alejandro.sarria@uao.edu.co, alejandro sarria, Código 2225498
//*  @author jose_ale.burbano@uao.edu.co, jose alejandro burbano, Código 2225498
//* @date 30 /Agosto/2023
//* @version 1.0

package modelo;

public abstract class Base {

    public abstract Base copy();
}
