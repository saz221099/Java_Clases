/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersonaservicesws;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

/**
 *
 * @author carlo
 */
public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecutando servicio listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        for (Persona p : personas) {
            System.out.println("p = " + p);
        }
        System.out.println("Fin servicio listar personas ws");

    }
}
