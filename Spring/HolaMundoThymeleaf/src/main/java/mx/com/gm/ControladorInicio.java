/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Mensaje Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("Juan@gmail.com");
        persona.setTelefono("21212112");

        var persona2 = new Persona();
        persona2.setNombre("Juana");
        persona2.setApellido("Perez");
        persona2.setEmail("Juana@gmail.com");
        persona2.setTelefono("212121132");

        //List<Persona> personas = new ArrayList();
        //personas.add(persona);
        //personas.add(persona2);
         var personas = Arrays.asList(persona, persona2);
       
        log.info("Ejecutando el controlador Spring MVC");
        //model.addAttribute("persona", persona);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    }
}
