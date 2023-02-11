/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import domain.Calculadora2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author carlo
 */
public class Calculadora2Test {

    Calculadora2 calculadora;


    @BeforeEach
    public void before() {
        System.out.println("Before()");
        calculadora = new Calculadora2();
    }

 

    @Test
    public void testSum() {
        
        int resultado = calculadora.add(3, 2);
        int esperado = 5;
        assertEquals(esperado, resultado);

    }

    @Test
    public void testAnsSum() {
        calculadora.add(3, 2);
        int resultado = calculadora.ans();
        int esperado = 5;
        assertEquals(esperado, resultado);

    }
    
    

}
