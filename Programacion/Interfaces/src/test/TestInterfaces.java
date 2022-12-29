/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

/**
 *
 * @author carlo
 */
public class TestInterfaces {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //imprimir(datos);
        datos = new ImplementacionOracle();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
