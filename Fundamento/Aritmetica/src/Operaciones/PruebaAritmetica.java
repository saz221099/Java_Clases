/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author carlo
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //Variables locales
        var a=10;
        var b=2;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(3, 5);
         System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
    }
    
    public static void miMetodo(){
       // a=10;
        System.out.println("Otro método");
    }
}
