/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.PersonaDAO;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServicioImpl implements PersonaServiceRemote, PersonaService {
    
    @Inject
    private PersonaDAO personaDAO;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDAO.findAllPersonas();
    }
    
    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDAO.findPersonaById(persona);
    }
    
    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }
    
    @Override
    public void registrarPersona(Persona persona) {
        personaDAO.insertPersona(persona);
    }
    
    @Override
    public void modificarPersona(Persona persona) {
        personaDAO.updatePersona(persona);
    }
    
    @Override
    public void EliminarPersona(Persona persona) {
        personaDAO.deletePersona(persona);
    }
    
}
