/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author Carlos Saz
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable=10;
        System.out.println("miVariable = " + miVariable);
      // miVariable=5;
      
        System.out.println(Persona.MI_CONSTANTE);
        
        final Persona persona1=new Persona();
       persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
    }
    
}
