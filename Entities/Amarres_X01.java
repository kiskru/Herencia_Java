/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;

/**
 * @author Kidver
 */
public class Amarres_X01 {

    private String nombreCliente;
    private int idCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco_X01 barco;

    public Amarres_X01() {
    }

    public Amarres_X01(int posicionAmarre, Barco_X01 barco) {
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Barco_X01 getBarco() {
        return barco;
    }

    public void setBarco(Barco_X01 barco) {
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    @Override
    public String toString() {
        return "Amarre " + (posicionAmarre+1) + "\n barco=" + barco
                + " nombre del Cliente=" + nombreCliente + ", idCliente=" + idCliente
                + "\n Fecha del Alquiler=" + fechaAlquiler + ", fecha de Devolucion=" + fechaDevolucion + "\n";
    }

}//The end
