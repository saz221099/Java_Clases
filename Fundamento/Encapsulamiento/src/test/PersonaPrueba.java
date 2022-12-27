/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dominio.Persona;

/**
 *
 * @author carlo
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1= new Persona("Juan",5000.00,false);
      //   System.out.println("nombre viejo = " + persona1.getNombre());
      System.out.println("persona1 = " + persona1);
        persona1.setNombre("Juan Carlos");
//        System.out.println("nombre: "+persona1.getNombre());
//        System.out.println("sueldo = " + persona1.getSueldo());
//        System.out.println("eliminado = " + persona1.isEliminado());
System.out.println("persona1 = " + persona1);
        
    }
}
