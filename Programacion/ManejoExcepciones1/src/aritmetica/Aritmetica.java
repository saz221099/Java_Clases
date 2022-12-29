/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import excepciones.OperacionExcepcion;


/**
 *
 * @author carlo
 */
public class Aritmetica {
    public static int division(int numerador,int denominador){
        if(denominador==0){
            throw new OperacionExcepcion("División entre cero");
        }
        return numerador/denominador;
    }
}
