/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enums.EstadoCivil;
import static HerenciaMain.Facultad_ejX04.scan;

/**
 * En cuanto a los estudiantes, se requiere almacenar el curso en el que están
 * matriculados.
 *
 * @author Kidver
 */
public class Estudiante_X04 extends Persona_X04 {

    protected int curso;

    public Estudiante_X04() {
    }

    public Estudiante_X04(String nombre, String apellido, int ID) {
        super(nombre, apellido, ID);

    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void matricularCurso() {

        System.out.println("A que curso desea matricularse? ");
        this.setCurso(scan.nextInt()); 
        System.out.println("El estuduante se ha matriculado al curso "+ curso);

    }

    @Override
    public String toString() {
        return "Estudiante \n" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil+ ""
                + "\ncurso=" + curso + '\n';
    }

}//The end
