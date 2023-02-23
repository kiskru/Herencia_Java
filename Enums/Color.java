/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Kidver
 */
public enum Color {
    
    NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris"), BLANCO("Blanco");

    private String color;

    private Color() {
    }

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
