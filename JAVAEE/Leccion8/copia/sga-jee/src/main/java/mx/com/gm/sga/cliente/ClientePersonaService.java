/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente;


import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al ejb desde el cliente");
        try {
           javax.naming.Context jndi=new InitialContext();
            PersonaServiceRemote personaService=(PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServicioImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            List<Persona> personas=personaService.listarPersonas();
            for(Persona persona:personas){
                    System.out.println("persona = " + persona);
            }
            
            System.out.println("\nFin fallada al EJB desde el cli");
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
        
    }
}
