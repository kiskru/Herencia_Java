/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package Entities;

import Enums.EstadoCivil;
import static HerenciaMain.Facultad_ejX04.scan;

/**
 * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
 * de identificación y su estado civil.
 *
 * @author Kidver
 */
public abstract class Persona_X04 {

    protected String nombre;
    protected String apellido;
    protected int ID;
    protected EstadoCivil estadoCivil;

    public Persona_X04() {
      
    }

    public Persona_X04(String nombre, String apellido, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

   
    
    public void cambioEstadoCivil() {
        boolean flag = true;
        System.out.println("\nServicio de cambio de estado civil");
       
        do {
            System.out.println("Ingrese el nuevo estado civil.");
            for (EstadoCivil est : EstadoCivil.values()) {
                System.out.print(est + " / ");
            }
            String aux = scan.next().toUpperCase();

            for (EstadoCivil est : EstadoCivil.values()) {

                if (est.name().equals(aux)) {
                    this.estadoCivil = est;
                    flag = false;
                    break;
                }
                
            }
            
            if (flag) {
                System.out.println("Estado civil incorrecto");
            }

        } while (flag);

        System.out.println("Se ha cambiado el estado civil a: " + estadoCivil);
    }

    @Override
    public String toString() {
        return "Persona_X04{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil + '}';
    }

   
             
    
}//The end
