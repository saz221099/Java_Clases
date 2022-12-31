/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.cascada;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author carlo
 */
public class PersistenciaCascadaJPA {
    static Logger log=LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em =emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();
        tx.begin();
        //paso 1 crea un objeto
        Persona persona=new Persona("Ariel", "Hernandez", "Ariel@gmail.com", "12345676");
        
        //crear usuario
        Usuario usuario = new Usuario("ariels", "12345676",persona);
        
        //paso 3 persistimos el objeto.
        em.persist(usuario);
        
        //paso 4 commit
        tx.commit();
        
        //objetos en estado detached
        log.debug("objeto persona"+persona);
        log.debug("objeto usuario"+usuario);
        
        
    }
}
