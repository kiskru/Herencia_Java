/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Puerto_X01;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Kidver
 */
public class Puerto_EJX01 {

    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
       
        Puerto_X01 nuevoMundo = new Puerto_X01(7, "Nuevo Mundo");
        
//        nuevoMundo.mostrarBarcos();
        nuevoMundo.calcularAlquiler();
        
        
        // TODO code application logic here
    }

}//The end
