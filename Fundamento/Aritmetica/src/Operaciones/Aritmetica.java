/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

public class Aritmetica {

    int a;
    int b;

    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("constructor");
    }
    public Aritmetica(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("argumentos");
    }
    
    public void sumar() {
        System.out.println(a + b);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return a + b;
    }
}
