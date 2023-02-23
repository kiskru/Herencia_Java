/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Animal_01;
import Entities.Caballo_01;
import Entities.Gato_01;
import Entities.Perro_01;
import java.util.Scanner;

/*
 * @author Kidver
 */
public class Animal_EJ01 {

    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Animal_01 perro1 = new Perro_01("Sirius", "Carne", 38, "licantropo");
        Animal_01 perro2 = new Perro_01("shadow", "purina", 8, "labbrador");
        Animal_01 gato1 = new Gato_01(7, "garras", "Raton", 3, "MainCoon");
        Animal_01 caballo = new Caballo_01("prieto", "pasto", 5, "Arabe");
        
        perro1.Alimentarse();
        perro2.Alimentarse();
        gato1.Alimentarse();
        caballo.Alimentarse();
    }

}//The end
