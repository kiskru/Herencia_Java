/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Televisor_02;
import static HerenciaMain.Electrodomestico_EJ02.scan;

/**
 * @author Kidver
 */
public class TvService extends ElectrodomesticoService {

    public Televisor_02 crearTelevisor() {

        Televisor_02 tele = new Televisor_02();
        super.crearElectrodomestico(tele);
        System.out.println("Ingrese la resolucion del televisor");
        tele.setResolucion(scan.nextInt());
        System.out.println("Tiene TDT? s/n");
        String aux = scan.next().substring(0, 1).toLowerCase();
        if ("s".equals(aux)) {

            tele.setTDT(true);

        } else {

            tele.setTDT(false);
        }
        this.precioFial(tele);
        return tele;
    }
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente 
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
    también deben afectar al precio.
     */

    public void precioFial(Televisor_02 tele){
        super.precioFinal(tele);
        if (tele.getResolucion()>40) {
            tele.setPrecio(tele.getPrecio()+((tele.getPrecio()*30)/100));
        }if (tele.getTDT()) {
            tele.setPrecio(tele.getPrecio()+500);
        }
            
        
    }
    
    
    
}//The end
