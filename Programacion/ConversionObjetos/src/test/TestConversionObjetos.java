/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author Carlos Saz
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado=new Escritor("Juan", 6000,TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        
        System.out.println(empleado.obtenerDetalles());
        
        //downcasting
        //((Escritor)empleado).getTipoEscritura();
        
        Escritor escritor=(Escritor) empleado;
        escritor.getTipoEscritura();
        
        
        Empleado empleado2=escritor;
        
    }
}
