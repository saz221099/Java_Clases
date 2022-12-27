/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caja;

/**
 *
 * @author carlo
 */
public class PruebaCaja {

    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.alto = 2;
        caja1.ancho = 3;
        caja1.profundo = 6;
        int resultado = caja1.calcularVolumen();
        System.out.println("El volumen de la caja es de :" + resultado);

        Caja caja2 = new Caja(2, 3, 6);
        resultado = caja2.calcularVolumen();
        System.out.println("El volumen de la caja es de :" + resultado);
    }
}
