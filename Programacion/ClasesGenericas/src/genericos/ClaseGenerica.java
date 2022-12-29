/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *
 * @author carlo
 */
public class ClaseGenerica<T> {
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto= objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es : "+objeto.getClass().getSimpleName());
    }

}
