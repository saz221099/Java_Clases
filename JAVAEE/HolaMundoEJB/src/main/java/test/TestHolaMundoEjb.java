/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi=new InitialContext();
            HolaMundoEjbRemote holamundoejb = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado= holamundoejb.sumar(5, 3);
            System.out.println("resultado = " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
