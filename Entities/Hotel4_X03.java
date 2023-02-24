/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * @author Kidver
 */
public class Hotel4_X03 extends Alojamiento_X03 {

//    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
//    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
//   
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected Character GYM;
    protected String nomRestaurante;
    protected int capRestaurante;
    protected double precioHab;

    public Hotel4_X03() {
    }

    public Hotel4_X03(int cantHabitaciones, int numCamas, int cantPisos, Character GYM, String nomRestaurante,
            int capRestaurante, double precioHab, String nombre, String direccion, String encargado) {
        super(nombre, direccion, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.GYM = GYM;
        this.nomRestaurante = nomRestaurante;
        this.capRestaurante = capRestaurante;
        this.precioHab = precioHab;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Character isGYM() {
        return GYM;
    }

    public void setGYM(Character GYM) {
        this.GYM = GYM;
    }

    public String getNomRestaurante() {
        return nomRestaurante;
    }

    public void setNomRestaurante(String nomRestaurante) {
        this.nomRestaurante = nomRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

//    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
//    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
//    agregado por gimnasio) + (valor agregado por limosinas). 
//    Donde: 
//    Valor agregado por el restaurante: 
//    • $10 si la capacidad del restaurante es de menos de 30 personas.
//    • $30 si está entre 30 y 50 personas. 
//    • $50 si es mayor de 50. 
//    Valor agregado por el gimnasio: 
//    • $50 si el tipo del gimnasio es A. 
//    • $30 si el tipo del gimnasio es B. 
//    Valor agregado por las limosinas: 
//    • $15 por la cantidad de limosinas del hotel.
    
    public void calcPrecioHab() {

        double res;
        if (capRestaurante < 30) {
            res = 10;
        } else if (capRestaurante >= 30 && capRestaurante <= 50) {
            res = 30;
        } else {
            res = 50;
        }

        double gym;
        switch (GYM) {
            case 'A':
                gym = 50;
                break;
            case 'B':
                gym = 30;
                break;
            default:
                System.out.println("La clasificacion del gimnacio es incorrecta");
                gym = 20;
                break;
        }

        double precio = 50 + numCamas + res + gym;
        precioHab = precio;
    }

    
    @Override
    public String toString() {
        return "Hotel 4 estrellas\n" + nombre + " direccion: " + direccion + " Encargado: " + encargado + " cantidad de Habitaciones: " + cantHabitaciones
                + " numero de Camas " + numCamas + " cantidad de Pisos " + cantPisos + " GYM " + GYM + " Restaurante: " + nomRestaurante
                + " capacidad del Restaurante: " + capRestaurante + " precio de Habitacion: " + precioHab + "\n";
    }

}//The end
