/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;


/**
 * @author Kidver
 */

public class Yate_X01 extends Barco_X01{
    
    private int numCamarotes;

    public Yate_X01() {
    }

    public Yate_X01(int numCamarotes, int matricula, double eslora, LocalDate anioFab) {
        super(matricula, eslora, anioFab);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate De Lujo " + "matricula=" + matricula + ", eslora=" + eslora + ", anioFab=" + anioFab + "numCamarotes=" + numCamarotes + '\n';
    }
    

}//The end
