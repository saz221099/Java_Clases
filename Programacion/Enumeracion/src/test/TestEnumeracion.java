/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Carlos Saz
 */
public class TestEnumeracion {

    public static void main(String[] args) {
//        System.out.println("Dia1 :" + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);

        System.out.println("continente no.4: "+Continentes.AMERICA);
              System.out.println("#paises: "+Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana ");

                break;
            default:
                throw new AssertionError();
        }
    }
}
