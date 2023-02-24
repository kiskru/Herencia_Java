/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 * Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
    disponibles y si posee o no un restaurante dentro de las instalaciones.
 * @author Kidver
 */

public class Camping_X03 extends AlojamientoExtraHotel_X03{
    
    protected int capCarpas;
    protected int canBaños;
    protected boolean restaurante;

    public Camping_X03() {
    }

    public Camping_X03(int capCarpas, int canBaños, boolean restaurante, boolean priv, double area, String nombre, String direccion, String encargado) {
        super(priv, area, nombre, direccion, encargado);
        this.capCarpas = capCarpas;
        this.canBaños = canBaños;
        this.restaurante = restaurante;
    }

    public int getCapCarpas() {
        return capCarpas;
    }

    public void setCapCarpas(int capCarpas) {
        this.capCarpas = capCarpas;
    }

    public int getCanBaños() {
        return canBaños;
    }

    public void setCanBaños(int canBaños) {
        this.canBaños = canBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping\n" + nombre + " direccion: " + direccion + " encargado: " + encargado 
                + " privado?  " + priv + " area: " + area
                + " capacidad max de Carpas: " + capCarpas + " cantidad de Banios=" + canBaños + " hay restaurante " + restaurante;
    }
    
    
    

}//The end
