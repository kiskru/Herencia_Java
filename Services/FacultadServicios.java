/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Estudiante_X04;
import Entities.Persona_X04;
import Entities.PersonalDeServicio;
import Entities.Profesor_X04;
import Enums.Clases;
import Enums.Departamento;
import Enums.Seccion;
import static HerenciaMain.Facultad_ejX04.scan;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Kidver
 */
public class FacultadServicios {

    ArrayList<Persona_X04> listaPersonal;

    public FacultadServicios() {
        listaPersonal = new ArrayList<Persona_X04>();
        crearPersona();
    }

    public void crearPersona() {

        for (int i = 0; i < 5; i++) {
            
            Estudiante_X04 estudiante = new Estudiante_X04("fer " + i, "Chiqui " + i, 456 * i);
            Profesor_X04 profesor = new Profesor_X04(Departamento.values()[new Random().nextInt(Departamento.values().length)], LocalDateTime.now(), i, "Profesor " + i, "Profe " + 1, 123 * i);
            PersonalDeServicio perSer = new PersonalDeServicio(Seccion.values()[new Random().nextInt(Seccion.values().length)], LocalDateTime.now(), i, "Persona " + i, "Servicio " + i, 789 * i);
            listaPersonal.add(estudiante);
            listaPersonal.add(profesor);
            listaPersonal.add(perSer);
        }
    }

    public Persona_X04 buscarPersona() {

        System.out.println("Sobre quien deseas realizar el cambio");
        String nombre = scan.next();
        for (Persona_X04 per : listaPersonal) {
            if (per.getNombre().equals(nombre)) {

                return per;
            }

        }
        System.out.println("La persona no ha sido encontrada en la facultad");

        return null;
    }

    public void mostrarPorTipo() {
        System.out.println("Que tipo de usuarios quieres ver ");
        for (Clases aux : Clases.values()) { //muestra el menu con los tipos en el enum
            System.out.println(
                    aux.ordinal() + 1 + ")" + aux.name()
            );
        }

        int aux = scan.nextInt();

        switch (aux) {
            case 1:
                //estudiante
                for (Persona_X04 per : listaPersonal) {
                    if (per instanceof Estudiante_X04) {
                        System.out.println(per.toString());
                    }
                }
                break;
            case 2:
                // profesor
                for (Persona_X04 per : listaPersonal) {
                    if (per instanceof Profesor_X04) {
                        System.out.println(per.toString());
                    }
                }
                break;
            case 3:
                // persona de servicio
                for (Persona_X04 per : listaPersonal) {
                    if (per instanceof PersonalDeServicio) {
                        System.out.println(per.toString());
                    }
                }
                break;
            case 4:
                // todos
                for (Persona_X04 per : listaPersonal) {
                    System.out.println(per.toString());
                }
                break;
            default:
                System.out.println("Seleccion Erronea");
        }

    }

}//The end
