/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author Kidver
 */

public class Barco_X01 {

    protected int matricula;
    protected double eslora;
    protected LocalDate anioFab;

    public Barco_X01() {
    }

    public Barco_X01(int matricula, double eslora, LocalDate anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(LocalDate anioFab) {
        this.anioFab = anioFab;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Barco " + "matricula=" + matricula + ", eslora=" + eslora + ", anioFab=" + anioFab + '\n';
    }
    
    
    
    

}//The end
