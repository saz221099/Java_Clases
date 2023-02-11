/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface IPersonaService {

    public List<Persona> listarPersonas();

    public Persona encontrarPorId(Long idPersona);

    public Persona crear(Persona persona);

    public void eliminar(Long idPersona);

}
