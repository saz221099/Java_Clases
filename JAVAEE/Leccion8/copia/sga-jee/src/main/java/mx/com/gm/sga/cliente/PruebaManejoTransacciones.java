/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente;


import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;
import org.apache.logging.log4j.*;

/**
 *
 * @author carlo
 */
public class PruebaManejoTransacciones {
    static Logger log=LogManager.getRootLogger();
    public static void main(String[] args) {
        try {     
            Context jndi=new InitialContext();
           
            PersonaServiceRemote personaService =(PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaService");
       log.debug("Iniciando prueba manejo transaccional PersonaService");
       //Buscar un objeto persona
       Persona persona =personaService.encontrarPersonaPorId(new Persona(1));
       log.debug("Persona recuperado"+persona);
        } catch (NamingException ex) {
          
          log.debug(ex.getMessage());
        }
    }
   
    
}
