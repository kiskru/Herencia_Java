/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 * Para las residencias se 
 *  indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
 *  campo deportivo.
 * @author Kidver
 */

public class Residencia_X03 extends AlojamientoExtraHotel_X03{

    private int cantHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia_X03() {
    }

    public Residencia_X03(int cantHabitaciones, boolean descuento, boolean campoDeportivo, 
            boolean priv, double area, String nombre, String direccion, String encargado) {
        super(priv, area, nombre, direccion, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia\n" + nombre + " direccion: " + direccion + " encargado: " + encargado 
                + " privado?  " + priv + " area: " + area
                + "cantidad de Habitaciones: " + cantHabitaciones + "tiene descuento: " + descuento 
                + " tienecampo Deportivo: " + campoDeportivo
                
                ;
    }
    
    
    
    
}//The end
