/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.ventas.test;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

/**
 *
 * @author Carlos Saz
 */
public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 50.00);
        Producto producto2 = new Producto("pantalon", 100.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

    }
}
