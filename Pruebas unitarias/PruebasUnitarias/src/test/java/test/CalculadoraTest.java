/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import domain.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlo
 */
public class CalculadoraTest {
    
    @Test
    public void testSumar() {
      int esperado=5;
      int resultado=Calculadora.sumar(3, 2);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testRestar() {
       int esperado=1;
       int resultado=Calculadora.restar(3, 2);
        assertEquals(esperado, resultado);
    }
    
}
