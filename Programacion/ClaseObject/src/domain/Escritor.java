/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre,double sueldo,TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", tipoEscritura : "+this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Escritor{ ");
        sb.append(" tipoEscritura= ").append(tipoEscritura);
        sb.append(" padre= ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
}
