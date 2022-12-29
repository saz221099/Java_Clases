/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author carlo
 */
public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        
         System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
  System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
          System.out.println("Eliminar desde Mysql");
    }
    
}
