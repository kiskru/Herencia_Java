/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Estudiante_X04;
import Entities.PersonalDeServicio;
import Entities.Profesor_X04;
import java.util.Scanner;

/**
 * @author Kidver
 */
public class Facultad_ejX04 {

    public static Scanner scan= new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Estudiante_X04 est = new Estudiante_X04();
        Profesor_X04 pro = new Profesor_X04();
        PersonalDeServicio perSer = new PersonalDeServicio();
        
        
        est.cambioEstadoCivil();
        pro.reasignacionDespacho();
        est.matricularCurso();
        pro.cambioDepartamento();
        perSer.trasladoSeccion();
        
        
    }
    
    // TODO code application logic here
}//The end
