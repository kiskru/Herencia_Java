/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;



/**
 * @author Kidver
 */

public class Velero_X01 extends Barco_X01{
    private int numMastiles;

    public Velero_X01() {
    }

    public Velero_X01(int numMastiles, int matricula, double eslora, LocalDate anioFab) {
        super(matricula, eslora, anioFab);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    
    
    @Override
    public String toString() {
        return "Velero " + " matricula=" + matricula + ", eslora=" + eslora + ", anioFab=" + anioFab+ ", numMastiles=" + numMastiles + '\n';
    }

    


}//The end
