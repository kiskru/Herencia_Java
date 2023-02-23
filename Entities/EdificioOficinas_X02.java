/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * @author Kidver
 */
public final class EdificioOficinas_X02 extends Edificio_X02 {

    protected Integer oficinas;
    protected Integer personas;
    protected Integer pisos;

    public EdificioOficinas_X02() {
    }

    public EdificioOficinas_X02(Integer oficinas, Integer personas, Integer pisos, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    protected int calcularSuperficie() {
        return (2 * (alto * ancho + alto * largo + ancho * largo) * pisos);
    }

    @Override
    protected int calcularVolumen() {
        return alto * largo * ancho * pisos;
    }

    public void cantPersonas() {
        System.out.println("\nla cantidad de personas en cada piso: "
                + "\nLa cantidad total de personas en el edificio es: " + personas * pisos + "\n");

    }

    @Override
    public String toString() {
        return "Edificio de Oficinas\n" + "oficinas: " + oficinas + "personas: " + personas + "pisos: " + pisos;
    }

}//The end
