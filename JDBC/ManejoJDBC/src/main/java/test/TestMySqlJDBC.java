/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestMySqlJDBC {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        //insertando nuevo objeto
       // Persona personaNueva = new Persona("Carlos", "Saz", "carlos@gmail.com", "09876543");
       // personaDAO.insertar(personaNueva);

       //MODIFICAR
      // Persona personaModificar=new Persona(4, "Juan Carlos", "Saza", "carlos@gmail.com","09876543");
      //personaDAO.actualizar(personaModificar);
      
      //ELIMINAR
      Persona personaEliminar=new Persona(5);
      personaDAO.eliminar(personaEliminar);
      
        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
