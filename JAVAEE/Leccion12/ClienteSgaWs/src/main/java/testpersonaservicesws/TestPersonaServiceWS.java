/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersonaservicesws;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author carlo
 */
public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        ((BindingProvider) personaService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        ((BindingProvider) personaService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");
        System.out.println("Ejecutando servicio listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("");
            System.out.println("persona id = " + persona.getIdPersona());
            System.out.println("persona nombre = " + persona.getNombre());
            System.out.println("persona apellido = " + persona.getApellido());
            System.out.println("persona email = " + persona.getEmail());
            System.out.println("persona telefono = " + persona.getTelefono());
        }
        System.out.println("");
        System.out.println("Fin servicio listar personas ws");

    }
}
