/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Edificio_X02;
import Entities.EdificioOficinas_X02;
import Entities.Polideportivo_X02;
import java.util.ArrayList;
import java.util.Scanner;
    
/*
 * @author Kidver
 */

public class EdificioMain_EJX02_ {
    
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        ArrayList <Edificio_X02> edificios = new ArrayList();
        Edificio_X02 poli1 = new Polideportivo_X02("Campin", "coliseo", 20, 50, 100);
        Edificio_X02 poli2 = new Polideportivo_X02("gladiador", "arena", 50, 120, 200);
        Edificio_X02 of1 = new EdificioOficinas_X02(20, 15, 20, 50, 20, 20);
        Edificio_X02 of2 = new EdificioOficinas_X02(10, 20, 10, 30, 20, 20);
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(of1);
        edificios.add(of2);
        edificios.toString();
        
        
        
        // TODO code application logic here
    }

}//The end
