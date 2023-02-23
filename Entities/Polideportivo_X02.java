/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * @author Kidver
 */
public final class Polideportivo_X02 extends Edificio_X02{

    private String nombre;
    private String tipo;

    public Polideportivo_X02() {
    }

    public Polideportivo_X02(String nombre, String tipo, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    protected int calcularSuperficie() {
        return 2 * (alto*ancho+alto*largo+ancho*largo);
    }

    @Override
    protected int calcularVolumen() {
        return alto*largo*ancho;
    }

}//The end
