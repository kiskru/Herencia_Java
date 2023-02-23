/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Electrodomestico_02;
import Services.ElectrodomesticoService;
import Services.LavadoraService;
import Services.TvService;
import java.util.Scanner;

/*
 * @author Kidver
 */
public class Electrodomestico_EJ02 {

    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ElectrodomesticoService ser = new ElectrodomesticoService();
        LavadoraService serLava = new LavadoraService();
        TvService serTv = new TvService();
//        Electrodomestico electro = new Electrodomestico();
//        ser.crearElectrodomestico(electro);
//        System.out.println(electro);
        Electrodomestico_02 lava = serLava.crearLavadora();
        System.out.println(lava);
        Electrodomestico_02 tele = serTv.crearTelevisor();
        System.out.println(tele);
        
        System.out.println("Estos son los electrodomesticos generados\n");
//        System.out.println(electro);
        System.out.println(lava);
        System.out.println(tele);

    }

}//The end
