/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 * @author Kidver
 */

public class Gato_01 extends Animal_01{
    private int vidas;

    public Gato_01(int vidas, String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    


}//The end
