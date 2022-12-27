/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;

/**
 *
 * @author Carlos Saz
 */
public class ClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jua", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if(empleado1==empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("iguales");
        }else{
            System.out.println("diferentes");
        }
        
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("iguales");
        }else{
            System.out.println("diferentes");
        }
    }
}
