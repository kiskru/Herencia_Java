/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.Departamento;
import Enums.EstadoCivil;
import static HerenciaMain.Facultad_ejX04.scan;
import java.time.LocalDateTime;

/**
 * Por lo que se refiere a los profesores, es necesario gestionar a qué
 * departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
 *
 * @author Kidver
 */
public class Profesor_X04 extends Empleado_X04 {

    protected Departamento dep;

    public Profesor_X04() {
    }

    public Profesor_X04(Departamento dep, LocalDateTime fechaIncorp, int numDerpacho, String nombre, String apellido, int ID) {
        super(fechaIncorp, numDerpacho, nombre, apellido, ID);
        this.dep = dep;
    }

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }

    public void cambioDepartamento() {

        System.out.println("Ingrese el nuevo departamento."
                + "\nSeleccione un numero de la lista");
        Departamento[] departamentos = Departamento.values(); //Convertir el enum en array
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println(i + 1 + ")" + departamentos[i] + "."); //imprimir valores enum para ver opciones
        }

        while (!scan.hasNextInt()) {  // Mientras que no sea un entero
            
            System.out.println("El valor ingresado no es un número. Inténtalo de nuevo.");
            scan.next();  // Limpia la entrada del usuario
        }

        int aux = scan.nextInt();  // Lee el número entero ingresado  
        dep=departamentos[aux-1]; //resta un numero por el array
        
        System.out.println("Se ha cambiado el departamento a " + dep);
       
    }

    @Override
    public String toString() {
        return "Profesor \n" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil+ ""
                + "\nfechaIncorp=" + fechaIncorp + ", numDerpacho=" + numDerpacho+ "dep=" + dep + '}';
    }

    
    
    
}//The end
