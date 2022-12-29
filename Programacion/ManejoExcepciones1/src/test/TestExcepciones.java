/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;
/**
 *
 * @author carlo
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado =division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OpreacionExcepcion");
              System.out.println(e.getMessage());
      
        } catch (Exception e) {
            System.out.println("Ocurrió un error de tipo Exception");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println(
                "resultado = " + resultado);
    }

}
