/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Empleado_X04;
import Entities.Estudiante_X04;
import Entities.Persona_X04;
import Entities.PersonalDeServicio;
import Entities.Profesor_X04;
import Services.FacultadServicios;
import java.util.Scanner;

/**
 * @author Kidver
 */
public class Facultad_ejX04 {

    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        FacultadServicios serv = new FacultadServicios();

        boolean flag = true;
        do {

            System.out.println(""
                    + "\nSistema De Gestion De Facultad\n"
                    + " 1• Cambio del estado civil de una persona.\n"
                    + " 2• Reasignación de despacho a un empleado. \n"
                    + " 3• Matriculación de un estudiante en un nuevo curso. \n"
                    + " 4• Cambio de departamento de un profesor. \n"
                    + " 5• Traslado de sección de un empleado del personal de servicio.\n"
                    + " 6• Mostrar listas de personas por tipo.\n"
                    + " 7• Mostrar persona.\n"
                    + " 8• Salir.\n"
            );
            int var = scan.nextInt();

            switch (var) {
                case 1:
                    Persona_X04 I = serv.buscarPersona();
                    if (I == null) {
                        System.out.println("NO EXISTE");
                    } else {
                        I.cambioEstadoCivil();
                    }
                    break;
                case 2:
                    Persona_X04 II = serv.buscarPersona();
                    if (II instanceof Empleado_X04) {
                        ((Empleado_X04) II).reasignacionDespacho();

                    } else {
                        System.out.println("La persona en cuestion no es un Empleado");
                    }
                    break;
                case 3:
                    Persona_X04 III = serv.buscarPersona();
                    if (III instanceof Estudiante_X04) {
                        ((Estudiante_X04) III).matricularCurso();
                    } else {
                        System.out.println("La persona en cuestion no es un Estudiante");
                    }
                    break;
                case 4:
                    Persona_X04 IV = serv.buscarPersona();
                    if (IV instanceof Profesor_X04) {
                        ((Profesor_X04) IV).cambioDepartamento();
                    }else {
                        System.out.println("La persona en cuestion no es un Profesor");
                    }
                    break;
                case 5:
                    Persona_X04 V = serv.buscarPersona();
                    if (V instanceof PersonalDeServicio) {
                        ((PersonalDeServicio) V).reasignacionDespacho();
                    }else {
                        System.out.println("La persona en cuestion no es una Persona de Servicios");
                    }break;
                case 6:
                    serv.mostrarPorTipo();
                    break;
                case 7:
                    System.out.println(serv.buscarPersona().toString());
                    break;
                case 8:
                    flag = false;
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (flag);

    }

    // TODO code application logic here
}//The end
