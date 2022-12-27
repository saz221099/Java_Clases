/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author carlo
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1= new Persona("Juan");
         Persona persona2= new Persona("Gerardo");
         imprimir(persona1);
         imprimir(persona2);
    }
    
   static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
