/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, //
 * Nombre del Restaurante, Capacidad del Restaurante, Precio de las
 * Habitaciones.
 *
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
 * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones
 * de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las
 * Habitaciones. Los gimnasios pueden ser clasificados por la empresa como de
 * tipo “A” o de tipo “B”, de acuerdo a las prestaciones observadas. Las
 * limosinas están disponibles para cualquier cliente, pero sujeto a
 * disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
 * será.
 *
 * @author Kidver
 */
public final class Hotel5_X03 extends Hotel4_X03 {

    private int salonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5_X03() {
    }

    public Hotel5_X03(int salonesConferencia, int cantSuites, int cantLimosinas, int cantHabitaciones,
            int numCamas, int cantPisos, Character GYM, String nomRestaurante, int capRestaurante,
            double precioHab, String nombre, String direccion, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, GYM, nomRestaurante, capRestaurante, nombre, direccion, encargado);
        this.salonesConferencia = salonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.precioHab = this.calcPrecioHab();
    }

    public int getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(int salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public Double calcPrecioHab() {
        Double precio = super.calcPrecioHab();
        precio += 15 * cantLimosinas;
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.salonesConferencia;
        hash = 67 * hash + this.cantSuites;
        hash = 67 * hash + this.cantLimosinas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel5_X03 other = (Hotel5_X03) obj;
        if (this.salonesConferencia != other.salonesConferencia) {
            return false;
        }
        if (this.cantSuites != other.cantSuites) {
            return false;
        }
        return this.cantLimosinas == other.cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel 5 Estrellas - " + nombre + "\n direccion: " + direccion + " Encargado: " + encargado + " cantidad de Habitaciones: " + cantHabitaciones
                + "\n numero de Camas " + numCamas + " cantidad de Pisos " + cantPisos + " GYM " + GYM + " Restaurante: " + nomRestaurante
                + "\n capacidad del Restaurante: " + capRestaurante + " Cantidad de salones Conferencia: " + salonesConferencia + " cantidad de Suites: " + cantSuites
                + "\n cantidad de Limosinas=" + cantLimosinas + " precio de Habitacion: " + precioHab + "\n";
    }

}//The end
