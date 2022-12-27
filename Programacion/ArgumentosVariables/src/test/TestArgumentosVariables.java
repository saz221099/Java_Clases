/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Carlos Saz
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
         imprimirNumeros(1,2);
         variosParametros("Juan", 1,2);
    }
    
    private static void variosParametros(String nombre,int ... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos = " + numeros[i]);
        }
    }
}
