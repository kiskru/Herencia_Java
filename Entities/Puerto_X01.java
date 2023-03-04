/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import static HerenciaMain.Puerto_EJX01.scan;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

/**
 * @author Kidver
 */
public class Puerto_X01 {

    private Amarres_X01[] amarres;
    private String nombre;

    public Puerto_X01() {
    }

    public Puerto_X01(int numAmarres, String nombre) {
        this.amarres = new Amarres_X01[numAmarres];
        this.nombre = nombre;
        this.crearBarcos();
    }

    public Amarres_X01[] getAmarres() {
        return amarres;
    }

    public void setAmarres(Amarres_X01[] amarres) {
        this.amarres = amarres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void crearBarcos() {
        Barco_X01 BI = new Velero_X01(2, 111, 10, LocalDate.parse("1994-07-16"));
        Barco_X01 BII = new Velero_X01(3, 112, 20, LocalDate.parse("2000-01-23"));
        Barco_X01 BIII = new Velero_X01(1, 113, 8, LocalDate.parse("2005-01-23"));
        Barco_X01 BIV = new BarcoMotor_X01(20, 114, 5, LocalDate.parse("2010-10-10"));
        Barco_X01 BV = new BarcoMotor_X01(30, 115, 8, LocalDate.parse("2012-12-15"));
        Barco_X01 BVI = new Yate_X01(4, 50, 116, 20, LocalDate.parse("2008-11-06"));
        Barco_X01 BVII = new Yate_X01(8, 10, 117, 40, LocalDate.parse("2020-06-15"));

        Amarres_X01 AI = new Amarres_X01(0, BI);
        Amarres_X01 AII = new Amarres_X01(1, BII);
        Amarres_X01 AIII = new Amarres_X01(2, BII);
        Amarres_X01 AIV = new Amarres_X01(3, BIV);
        Amarres_X01 AV = new Amarres_X01(4, BV);
        Amarres_X01 AVI = new Amarres_X01(5, BVI);
        Amarres_X01 AVII = new Amarres_X01(6, BVII);
        amarres[0] = AI;
        amarres[1] = AII;
        amarres[2] = AIII;
        amarres[3] = AIV;
        amarres[4] = AV;
        amarres[5] = AVI;
        amarres[6] = AVII;

    }

    public void mostrarBarcos() {
        for (int i = 0; i < amarres.length; i++) {
            System.out.println(
                    amarres[i]
            );
        }
    }

    /*  Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
     *  alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
     *  multiplicando por 10 los metros de eslora).
     *  En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
        sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
        en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
        el número de camarotes.
     */
    public void calcularAlquiler() {
        
        this.mostrarBarcos();
        System.out.println("Elije el numero del amarre en el que se encuentra el barco");
        int posicion = scan.nextInt()-1;
        double eslora = amarres[posicion].getBarco().getEslora();
        System.out.println("en que fecha quieres alquilar el barco?"
                + "yyyy-mm-dd");
        LocalDate fechaInicio = LocalDate.parse(scan.next());
        System.out.println("Fecha de devolucion del barco:"
                + "yyyy-mm-dd");
        LocalDate fechaFin = LocalDate.parse(scan.next());
        long numdias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        Double precio = (numdias * (eslora * 10));

        if (amarres[posicion].getBarco() instanceof Velero_X01) {
            precio += ((Velero_X01) amarres[posicion].getBarco()).getNumMastiles();
        } else {
            if (amarres[posicion].getBarco() instanceof BarcoMotor_X01) {
                precio += ((BarcoMotor_X01) amarres[posicion].getBarco()).getPotencia();
            } else {
                if (amarres[posicion].getBarco() instanceof Yate_X01) {
                    precio += (((Yate_X01) amarres[posicion].getBarco()).getNumCamarotes() 
                            + ((Yate_X01) amarres[posicion].getBarco()).getPotencia());
                }
            }
        }

        System.out.print("\nEl precio del alquiler es de: "+precio+"$\n");
    }

    @Override
    public String toString() {
        return "Puerto " + nombre + "\n"
                + "Amarre" + Arrays.toString(amarres) + '\n';
    }

}//The end
