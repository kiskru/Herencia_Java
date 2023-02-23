/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Electrodomestico_02;
import Enums.Color;
import static HerenciaMain.Electrodomestico_EJ02.scan;

/**
 * @author Kidver
 */
public class ElectrodomesticoService {


    private void comprobarConsumo(Electrodomestico_02 electro) {
        System.out.println("Ingrese la letra correspondie al consumo");
        String letra = scan.next().substring(0, 1);
        if ("AaBbCcDdEe".contains(letra)) {
            electro.setConsumoEne(letra.toUpperCase().charAt(0));
        } else {
            electro.setConsumoEne('F');
        }
    }

    private void comprobarColor(Electrodomestico_02 electro) {
        System.out.println("Elije el color deseado \n"
                + "Colores Disponibles:");
        for (Color aux : Color.values()) {
            System.out.print(aux.getColor() + "--");
        }
        System.out.print("\n->");

        String color2 = scan.next().toLowerCase();
        for (Color aux : Color.values()) {
            if (aux.getColor().equalsIgnoreCase(color2)) {
                electro.setColor(aux);
                break;
            } else {
                electro.setColor(aux.BLANCO);
            }

        }

    }

    public void crearElectrodomestico(Electrodomestico_02 electro) {
        
        electro.setPrecio(1000);
        comprobarColor(electro);
        comprobarConsumo(electro);
        System.out.println("Ingrese el peso ");
        Integer peso = scan.nextInt();
        electro.setPeso(peso);
        precioFinal(electro);
    }

    protected void precioFinal(Electrodomestico_02 electro) {
        switch (electro.getConsumoEne()) {
            case 'a':
            case 'A':
                electro.setPrecio(electro.getPrecio() + 1000);
                break;
            case ('b'):
            case 'B':
                electro.setPrecio(electro.getPrecio() + 800);
                break;
            case ('c'):
            case ('C'):
                electro.setPrecio(electro.getPrecio() + 600);
                break;
            case ('d'):
            case ('D'):
                electro.setPrecio(electro.getPrecio() + 500);
                break;
            case ('e'):
            case ('E'):
                electro.setPrecio(electro.getPrecio() + 300);
                break;
            case ('f'):
            case ('F'):
                electro.setPrecio(electro.getPrecio() + 100);
                break;
            default:
                System.out.println("Categoria de consumo Erronea");
        }

        int peso = electro.getPeso();
        if (peso >= 1 && peso < 20) {
            electro.setPrecio(electro.getPrecio() + 100);
        } else if (peso >= 20 && peso < 50) {
            electro.setPrecio(electro.getPrecio() + 500);
        } else if (peso >= 50 && peso < 80) {
            electro.setPrecio(electro.getPrecio() + 800);
        } else if (peso >= 80) {
            electro.setPrecio(electro.getPrecio() + 1000);
        } else {
            System.out.println("El peso es un valor incorrecto");
        }

    }
    

}//The end
