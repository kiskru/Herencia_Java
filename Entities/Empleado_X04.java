/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.EstadoCivil;
import static HerenciaMain.Facultad_ejX04.scan;
import java.time.LocalDateTime;


/**
 * 
 * Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado.
 * @author Kidver
 */

public class Empleado_X04 extends Persona_X04{
    
    protected LocalDateTime fechaIncorp;
    protected int numDerpacho;

    public Empleado_X04() {
    }

    public Empleado_X04(LocalDateTime fechaIncorp, int numDerpacho, String nombre, String apellido, int ID, EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.fechaIncorp = fechaIncorp;
        this.numDerpacho = numDerpacho;
    }

    public LocalDateTime getFechaIncorp() {
        return fechaIncorp;
    }

    public void setFechaIncorp(LocalDateTime fechaIncorp) {
        this.fechaIncorp = fechaIncorp;
    }

    public int getNumDerpacho() {
        return numDerpacho;
    }

    public void setNumDerpacho(int numDerpacho) {
        this.numDerpacho = numDerpacho;
    }
    
    public void reasignacionDespacho(){
        System.out.print("ingresa el numero del nuevo despacho: ");
        
        while (!scan.hasNextInt()) {  // Mientras que no sea un entero
            
            System.out.println("El valor ingresado no es un número entero. Inténtalo de nuevo.");
            scan.next();  // Limpia la entrada del usuario
        }

        int numero = scan.nextInt();  // Lee el número entero ingresado
        
        numDerpacho=numero;
        System.out.println("se ha asignado el despacho " + numDerpacho);
    }
    
    
}//The end
