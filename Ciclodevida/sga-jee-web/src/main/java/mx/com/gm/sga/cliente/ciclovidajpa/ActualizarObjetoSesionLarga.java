/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mx.com.gm.sga.domain.Persona;

/**
 *
 * @author carlo
 */
public class ActualizarObjetoSesionLarga {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //Inicia la transaccion
        //paso 1.Iniciar una transación
        tx.begin();

        //paso 2. Ejecuta SQL de tipo select
        Persona persona = em.find(Persona.class, 1);

        //objeto en estado de detached
        log.debug("Objeto encontrado" + persona);

        //PASO 3 SETVALUE
        persona.setApellido("Suarez");

        //paso 4 termina la transación
        tx.commit();

        //objeto en detached ya modificado
        log.debug("Objeto modificado" + persona);

        //cerramos el entity manager
        em.close();
    }
}
