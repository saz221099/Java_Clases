/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

/**
 *
 * @author carlo
 */
public class TestServicioSumarWS {

    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();

        System.out.println("Ejecutando servicio sumar WS");
        int x = 2;
        int y = 3;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("La suma de " + x + " y " + y + " es de : " + resultado);
        System.out.println("Fin servicio sumar WS");
    }
}
