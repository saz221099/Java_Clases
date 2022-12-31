/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author carlo
 */
public class PersistirObjetoJPA {
    static Logger log =LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        //Inicia la transaccion
        
        //paso 1.Crea nuevo objeto en estado transitivo
        Persona persona=new Persona("Pedro", "Diaz", "Pedro@gmail.com", "12345678");
        
        //paso 2. Inicia la transaccion
        tx.begin();
        
        //paso 3 ejecuta sql
        em.persist(persona);
        log.debug(persona);
       

        //paso 4 commit/rollback
        tx.commit();
        
        //objeto en estado detached
       log.debug(persona);
       
       //cerramos el entity manager
       em.close();
    }
}
