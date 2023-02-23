/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Electrodomestico_02;
import Services.ElectrodomesticoService;
import Services.LavadoraService;
import Services.TvService;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Kidver
 */
public class Electrodomestico_EJ03 {
   
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList <Electrodomestico_02> elecList = new ArrayList();
        LavadoraService serLav = new LavadoraService();
        TvService serTv = new TvService();
        ElectrodomesticoService serElec = new ElectrodomesticoService();
        
        Electrodomestico_02 lava1 = serLav.crearLavadora();
        elecList.add(lava1);
        Electrodomestico_02 lava2 = serLav.crearLavadora();
        elecList.add(lava2);
        Electrodomestico_02 tv1 = serTv.crearTelevisor();
        elecList.add(tv1);
        Electrodomestico_02 tv2 = serTv.crearTelevisor();
        elecList.add(tv2);
        Electrodomestico_02 elec1 = new Electrodomestico_02();
        serElec.crearElectrodomestico(elec1);
        elecList.add(elec1);
        
        
        
        

        // TODO code application logic here
    }

}//The end
