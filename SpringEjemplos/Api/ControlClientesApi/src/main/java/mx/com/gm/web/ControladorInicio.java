/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/personas")
public class ControladorInicio {

    @Autowired
    private IPersonaService personaService;

    @GetMapping
    public List<Persona> listarPesonas() {
        return personaService.listarPersonas();
    }

    @GetMapping("/{idPersona}")
    public Persona encontrarPersonaPorId(@PathVariable Long idPersona) {
        return personaService.encontrarPorId(idPersona);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona create(@RequestBody Persona persona) {
        return personaService.crear(persona);
    }

    @PutMapping("/{idPersona}")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona update(@RequestBody Persona persona, @PathVariable Long idPersona) {
        Persona personaActual = personaService.encontrarPorId(idPersona);
        personaActual.setNombre(persona.getNombre());
        personaActual.setApellido(persona.getApellido());
        persona.setEmail(persona.getEmail());
        persona.setTelefono(persona.getTelefono());
        persona.setSaldo(persona.getSaldo());

        return personaService.crear(personaActual);
    }

    @DeleteMapping("/{idPersona}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void Eliminar(@PathVariable Long idPersona) {
        personaService.eliminar(idPersona);
    }

}
