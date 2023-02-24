/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 *  Los alojamientos se identifican por un nombre, una dirección, 
    una localidad y un gerente encargado del lugar.
 * @author Kidver
 */

public abstract class Alojamiento_X03 {
    
    protected String nombre;
    protected String direccion;
    protected String encargado;

    public Alojamiento_X03() {
    }

    public Alojamiento_X03(String nombre, String direccion, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Alojamiento\n" + nombre + " direccion: " + direccion + " encargado: " + encargado;
    }
    
    
    
}//The end
