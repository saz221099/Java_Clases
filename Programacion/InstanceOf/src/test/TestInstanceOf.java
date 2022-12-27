/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Carlos Saz
 */
public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 49.00);
          determinarTipo(empleado1);
        empleado1 = new Gerente("redes", "Karla", 50.00);
        //determinarTipo(empleado1);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
           // Gerente gerente = (Gerente) empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}
