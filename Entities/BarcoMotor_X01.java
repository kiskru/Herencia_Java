/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;

/**
 * @author Kidver
 */
public class BarcoMotor_X01 extends Barco_X01 {

    protected int Potencia;

    public BarcoMotor_X01() {
    }

    public BarcoMotor_X01(int Potencia, int matricula, double eslora, LocalDate anioFab) {
        super(matricula, eslora, anioFab);
        this.Potencia = Potencia;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor " + " matricula=" + matricula + "Potencia=" + Potencia + ", eslora=" + eslora + ", anioFab=" + anioFab + '\n';
    }

}//The end
