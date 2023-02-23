/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * @author Kidver
 */
public abstract class Edificio_X02 {

    protected Integer alto;
    protected Integer ancho;
    protected Integer largo;

    public Edificio_X02() {
    }

    public Edificio_X02(Integer alto, Integer ancho, Integer largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    protected abstract int calcularSuperficie();

    protected abstract int calcularVolumen();

    @Override
    public String toString() {
        return "Edificio" + "alto:" + alto + " ancho:" + ancho + " largo:" + largo;
    }

}//The end
