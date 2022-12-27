/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Carlos Saz
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1=new Clase1("publico");
        clase1.setAtributoPrivate("cambio valor");
        System.out.println("clase1 = " + clase1.getAtributoPrivate());
        
        
        
    }
 
}
