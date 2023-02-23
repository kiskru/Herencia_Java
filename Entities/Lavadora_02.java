/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.Color;

/**
 * @author Kidver
 */
public class Lavadora_02 extends Electrodomestico_02 {

    private int carga;

    public Lavadora_02() {
    }

    public Lavadora_02(int carga, Integer precio, Color color, Character consumoEne, Integer peso) {
        super(precio, color, consumoEne, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora:\n" + "precio=" + precio + ", color=" + color + ", consumoEne=" + consumoEne + ", peso=" + peso + ", Carga "+ carga;
    }

    
    
    

}//The end
