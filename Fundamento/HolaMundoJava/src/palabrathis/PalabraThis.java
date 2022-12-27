/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author carlo
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1= new Persona("Juan","Magan");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 = " + persona1.nombre);
        System.out.println("persona1 = " + persona1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("persona con this = " + this);
        new Imprimir().imprimir(this);
    }
    
    class Imprimir{
        public void imprimir(Persona persona){
            System.out.println("persona desde imprimir : "+persona);
            System.out.println("objeto actual con this = " + this);
        }
    }
    
    
}
