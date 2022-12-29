/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> clase=new ClaseGenerica(15);
        clase.obtenerTipo();
        
          ClaseGenerica<String> objetoString=new ClaseGenerica("Juan");
           objetoString.obtenerTipo();
    }
}
