/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Carlos Saz
 */
class Clase1 {
    private String atributoPrivate="valor privado";
    
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }
    
     
    
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
