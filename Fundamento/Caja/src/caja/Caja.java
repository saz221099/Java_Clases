/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caja;

/**
 *
 * @author carlo
 */
public class Caja {
int ancho;
int alto;
int profundo;

    public Caja() {
        System.out.println("constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen(){
        int resultado=this.ancho*this.alto*this.profundo;
        return resultado;
    }


  
    
}
