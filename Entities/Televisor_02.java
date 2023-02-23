/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.Color;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados.
 *
 * @author Kidver
 */
public class Televisor_02 extends Electrodomestico_02 {

    private Integer resolucion;
    private Boolean TDT;

    public Televisor_02() {
    }

    public Televisor_02(Integer resolucion, Boolean TDT, Integer precio, Color color, Character consumoEne, Integer peso) {
        super(precio, color, consumoEne, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        
        return "Televisor\n" + "precio=" + precio + ", color=" + color + ", consumoEne=" + consumoEne + ", peso=" + peso +
                "resolucion=" + resolucion + ", TDT=" + TDT;
    }

   
    
    
    
    
    
}//The end
