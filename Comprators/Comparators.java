/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprators;

import Entities.Hotel4_X03;
import java.util.Comparator;

/**
 * @author Kidver
 */
public class Comparators {

    public static Comparator<Hotel4_X03> ordenarPorNombre = new Comparator<Hotel4_X03>() {

        @Override
        public int compare(Hotel4_X03 t, Hotel4_X03 t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
}
       
        
    
  

//The end
