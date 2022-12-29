/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import operaciones.Operaciones;
/**
 *
 * @author carlo
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado= Operaciones.sumar(2, 3);
        System.out.println("resultado = " + resultado);
        var resultado2=Operaciones.sumar(20.2, 30.2);
        System.out.println("resultado = " + resultado2);
    }
}
