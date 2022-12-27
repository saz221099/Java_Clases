/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][]=new int[3][2];
        System.out.println(edades);
        edades[0][0]=5;
        edades[0][1]=7;
        edades[1][0]=8;
        edades[1][1]=4;
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades = " + edades[i][j]);
                
            }
 
            
        }
       
        
        String frutas[][]={{"Naranja","Limon"},{"fresa","manzana","Mora"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas = " + frutas[i][j]);
                
            }
            
        }
        
        
        Persona personas[][]=new Persona[2][3];
        personas[0][0]=new Persona("Juan");
         personas[0][1]=new Persona("Karla");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz = " + matriz[i][j]);
                
            }
            
        }
    }
}
