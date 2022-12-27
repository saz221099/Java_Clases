/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import domain.Persona;

/**
 *
 * @author Carlos Saz
 */
public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }

}

