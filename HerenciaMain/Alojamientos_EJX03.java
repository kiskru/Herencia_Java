/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaMain;

import Entities.Alojamiento_X03;
import Entities.Hotel4_X03;
import Entities.Hotel5_X03;
import java.util.Scanner;
import java.util.TreeSet;

/*
    Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
    de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
    acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
    una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
    alojamientos: Hoteles y Alojamientos Extrahoteleros. 
    Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
    Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
    características de las distintas categorías son las siguientes: 
    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
    • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
    Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
    acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
    cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
    será. 
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
    agregado por gimnasio) + (valor agregado por limosinas). 
    Donde: 
    Valor agregado por el restaurante: 
    • $10 si la capacidad del restaurante es de menos de 30 personas.
    • $30 si está entre 30 y 50 personas. 
    • $50 si es mayor de 50. 
    Valor agregado por el gimnasio: 
    • $50 si el tipo del gimnasio es A. 
    • $30 si el tipo del gimnasio es B. 
    Valor agregado por las limosinas: 
    • $15 por la cantidad de limosinas del hotel.

    En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
    hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
    Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
    cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
    Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
    disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
    indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
    campo deportivo. Realizar un programa en el que se representen todas las relaciones 
    descriptas. 
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
    • todos los alojamientos.
    • todos los hoteles de más caro a más barato.
    • todos los campings con restaurante
    • todos las residencias que tienen descuento.
     * @author Kidver
 */
public class Alojamientos_EJX03 {

    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        TreeSet<Alojamiento_X03> alojamientos = new TreeSet<>();
        Alojamiento_X03 H4_01 = new Hotel4_X03(20, 30, 4, 'S', "las delicias", 
                20,"El Hormiguero", "123 Malambo ", "Fernando");
        alojamientos.add(H4_01);
        Alojamiento_X03 H4_02 = new Hotel4_X03(20, 30, 4, 'A', "las delicias",
                20,"El Hormiguero", "123 Malambo ", "Fernando");
        alojamientos.add(H4_02);
        Alojamiento_X03 H5_01 = new Hotel5_X03(2, 10, 25, 30, 40, 5, 
                'A', "sabores", 60, 100, "Elixir", "AV magia", "merlin");
        alojamientos.add(H5_01);

        for (Alojamiento_X03 a : alojamientos) {
            System.out.println(a);
        }
        
        
        boolean bool = true;
        do {
            System.out.println(""
                    + "!Sistema de Alojamientos¡\n"
                    + "\n"
                    + "**Menu principal**\n"
                    + "\n"
                    + "1. • Ver todos los alojamientos.\n"
                    + "2. • Ver los hoteles ordenados de más caro a más barato.\n"
                    + "3. • Ver todos los campings con restaurante\n"
                    + "4. • Ver todos las residencias que tienen descuento \n"
                    + "5. • Salir\n");
            
            int aux = scan.nextInt();
            
            switch (aux) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    bool = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.\n"
                            + "Elige nuevamente");
            }

        } while (bool);
        // TODO code application logic here
    }

}//The end

