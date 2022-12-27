/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporvalor;

/**
 *
 * @author carlo
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x=10;
        System.out.println("x = " + x);
       x= cambioValor(x);
        
        System.out.println("x nuevo valor = " + x);
    }
    
    public static int cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        return arg1=15;
    }
}
