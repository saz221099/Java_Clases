/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author carlo
 */
public class ClienteAsociacionesJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();

        //cerramos la conexión
        em.close();

        //Imprimir los objetos de tipo persona
        for (Persona persona : personas) {
            log.debug("persona" + persona);
            //recuperamos los usuarios de cada persona
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario" + usuario);
            }
        }
    }
}
