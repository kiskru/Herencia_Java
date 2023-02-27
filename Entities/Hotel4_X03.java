/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Objects;

/**
 * @author Kidver
 */
public class Hotel4_X03 extends Alojamiento_X03 implements Comparable<Hotel4_X03> {

//    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
//    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
//   
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected Character GYM;
    protected String nomRestaurante;
    protected int capRestaurante;
    protected Double precioHab;

    public Hotel4_X03() {
    }

    public Hotel4_X03(int cantHabitaciones, int numCamas, int cantPisos, Character GYM, String nomRestaurante,
            int capRestaurante, String nombre, String direccion, String encargado) {
        super(nombre, direccion, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.GYM = GYM;
        this.nomRestaurante = nomRestaurante;
        this.capRestaurante = capRestaurante;
        this.precioHab = this.calcPrecioHab();
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

    public Double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Double precioHab) {
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
    
    protected Double calcPrecioHab() {

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
                gym = 30;
                break;
        }

        double precio = 50 + numCamas + res + gym;
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.cantHabitaciones;
        hash = 43 * hash + this.numCamas;
        hash = 43 * hash + this.cantPisos;
        hash = 43 * hash + Objects.hashCode(this.GYM);
        hash = 43 * hash + Objects.hashCode(this.nomRestaurante);
        hash = 43 * hash + this.capRestaurante;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.precioHab) ^ (Double.doubleToLongBits(this.precioHab) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.direccion);
        hash = 43 * hash + Objects.hashCode(this.encargado);
        return hash;
    }

    @Override
    public boolean equals  (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel4_X03 other = (Hotel4_X03) obj;
        if (this.cantHabitaciones != other.cantHabitaciones) {
            return false;
        }
        if (this.numCamas != other.numCamas) {
            return false;
        }
        if (this.cantPisos != other.cantPisos) {
            return false;
        }
        if (this.capRestaurante != other.capRestaurante) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioHab) != Double.doubleToLongBits(other.precioHab)) {
            return false;
        }
        if (!Objects.equals(this.nomRestaurante, other.nomRestaurante)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.GYM, other.GYM)){
            return false;
        }
        return Objects.equals(this.encargado, other.encargado);
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "Hotel 4 estrellas " + nombre + "\n- direccion: " + direccion + ". Encargado: " + encargado + ". cantidad de Habitaciones: " + cantHabitaciones
                + ".\n numero de Camas " + numCamas + ". cantidad de Pisos " + cantPisos + ". GYM " + GYM + ". Restaurante: " + nomRestaurante
                + ".\n capacidad del Restaurante: " + capRestaurante + ". precio de Habitacion: " + precioHab + "\n";
    }

    @Override
    public int compareTo(Hotel4_X03 t) {
        return t.getPrecioHab().compareTo(this.precioHab);
    }

}//The end
