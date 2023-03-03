/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.EstadoCivil;
import Enums.Seccion;
import static HerenciaMain.Facultad_ejX04.scan;
import java.time.LocalDateTime;

/**
 * @author Kidver
 */
public class PersonalDeServicio extends Empleado_X04 {

    protected Seccion seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccion, LocalDateTime fechaIncorp, int numDerpacho, String nombre, String apellido, int ID) {
        super(fechaIncorp, numDerpacho, nombre, apellido, ID);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion() {
        System.out.println("A que seccion vas a trasladar la persona?");
        System.out.println("seleccione una opcion numerica");
        int num = 1;
       
        for (Seccion sec : Seccion.values()) { //recorre enum
            System.out.println(num + ")" + sec);
            num += 1;
        }
        int aux = scan.nextInt() - 1;
        for (Seccion sec : Seccion.values()) {
            if (sec.ordinal() == aux) { //comparar la posicion del valor enum
                seccion = sec; //asignar 
                System.out.println("Se ha asignado la seccion " + sec);

            }
        }
    }

    @Override
    public String toString() {
        return "PersonalServicio\n" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil+ ""
                + "\nfechaIncorp=" + fechaIncorp + ", numDerpacho=" + numDerpacho+ "seccion=" + seccion + '\n';
    }

}//The end
