/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Lavadora_02;
import static HerenciaMain.Electrodomestico_EJ02.scan;

/**
 * @author Kidver
 */
public class LavadoraService extends ElectrodomesticoService {

    public Lavadora_02 crearLavadora() {

        Lavadora_02 lava = new Lavadora_02();
        super.crearElectrodomestico(lava);
        System.out.println("Ingresa la capacidad de carga");
        int carga = scan.nextInt();
        lava.setCarga(carga);
        this.precioFinal(lava);
        return lava;
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio.
     */
    
    public void precioFinal(Lavadora_02 lava) {
        super.precioFinal(lava);
          if (lava.getCarga() > 30) {
            lava.setPrecio(lava.getPrecio() + 500);
        }
        
    }
}//The end
