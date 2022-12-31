/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author carlo
 */
public class EliminarObjetoJPA {
     static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //Inicia la transaccion
        //paso 1.Iniciar una transación
        tx.begin();

        //paso 2. Ejecuta SQL de tipo select
        Persona persona = em.find(Persona.class, 13);

   
        //paso 3 termina la transación
        tx.commit();

        //objeto en detached ya modificado
        log.debug("Objeto encontrado" + persona);
        
        //paso 4 Inicia la transacción 2
         EntityTransaction tx2 = em.getTransaction();
         tx2.begin();
         //paso 5 ejecuta el sql
         em.remove(em.merge(persona));
         
          //paso 6 termina la transacción 2
         tx2.commit();

         //objeto en detached ya eliminado
        log.debug("Objeto eliminado" + persona);
        
        //cerramos el entity manager
        em.close();
    }
}
