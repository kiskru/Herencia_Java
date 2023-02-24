/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 * Por cada 
    Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
    cuadrados que ocupa. 
 * @author Kidver
 */

public abstract class AlojamientoExtraHotel_X03 extends Alojamiento_X03{
    
    protected boolean priv;
    protected double area;

    public AlojamientoExtraHotel_X03() {
    }

    public AlojamientoExtraHotel_X03(boolean priv, double area, String nombre, String direccion, String encargado) {
        super(nombre, direccion, encargado);
        this.priv = priv;
        this.area = area;
    }

    public boolean isPriv() {
        return priv;
    }

    public void setPriv(boolean priv) {
        this.priv = priv;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}//The end
