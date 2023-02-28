/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.Color;


/**
 * @author Kidver
 */

public class Electrodomestico_02 {
    protected Integer precio;
    protected Color color;
    protected Character consumoEne;
    protected Integer peso;

    public Electrodomestico_02() {
    }

    public Electrodomestico_02(Integer precio, Color color, Character consumoEne, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEne = consumoEne;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Character getConsumoEne() {
        return consumoEne;
    }

    public void setConsumoEne(Character consumoEne) {
        this.consumoEne = consumoEne;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico\n" + "precio=" + precio + ", color=" + color.getColor() + ", consumoEne=" + consumoEne + ", peso=" + peso;
    }
    
    
}//The end
