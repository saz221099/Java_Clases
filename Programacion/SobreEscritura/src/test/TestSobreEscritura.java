/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Carlos Saz
 */
public class TestSobreEscritura {
    public static void main(String[] args) {
        
        Empleado empleado1=new Empleado("Juan", 49.00);
        imprimir(empleado1);
        
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
    
           Gerente gerente1=new Gerente("redes", "Karla", 50.00);
        imprimir(gerente1);
           //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
