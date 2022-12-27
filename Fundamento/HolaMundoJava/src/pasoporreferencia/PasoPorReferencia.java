/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporreferencia;

import clases.Persona;
import pasoporvalor.PasoPorValor;

/**
 *
 * @author carlo
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("personal nombre = " + persona1.nombre);
        persona1=cambiaValor(persona1);
        System.out.println("persona1 nombre nuevo = " + persona1.nombre);
        
    }

    public static Persona cambiaValor(Persona persona) {
  
        if(persona==null){
            return null;
        }
           persona.nombre="Karla";
        return persona;
    }
}
