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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/personas")
public class ControladorInicio {

    @Autowired
    private IPersonaService personaService;

    @GetMapping
    public ResponseEntity<?> listarPersonas() {
        List<Persona> personas = personaService.listarPersonas();
        return ResponseEntity.ok(personas);
    }

    @GetMapping("/{idPersona}")
    public ResponseEntity<?> encontrarPersonaPorId(Persona persona) {
        persona = personaService.encontrarPersona(persona);
        return ResponseEntity.ok(persona);
    }

    @PostMapping
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona) {
        personaService.guardar(persona);
        return ResponseEntity.ok(persona);
    }
   
}
