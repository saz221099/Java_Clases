/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipo primitivos
        Integer entero=10; //Autoboxing porque es un objeto
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2=entero; //Unboxing Extrae el valor primitivo
        System.out.println("entero2 = " + entero2);
    }
}
