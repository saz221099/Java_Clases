/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.IPersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPorId(Long idPersona) {
        return personaDao.findById(idPersona).orElse(null);
    }

    @Override
    @Transactional
    public Persona crear(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Long idPersona) {
        personaDao.deleteById(idPersona);
    }

}
