/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.criteria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

/**
 *
 * @author carlo
 */
public class PruebaApiCriteria {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;

        //1.Consulta de todas las personas
        //paso1.EM crea una instancia de criteriBuilder
        cb = em.getCriteriaBuilder();

        //paso 2 se crea el objeto criteriaQuery
        criteriaQuery = cb.createQuery(Persona.class);

        //paso 3 creamos el objeto raiz
        fromPersona = criteriaQuery.from(Persona.class);

        //paso 4 seleccionamos lo necesario del from
        criteriaQuery.select(fromPersona);

        //paso 5 creamos el query typesafe
        query = em.createQuery(criteriaQuery);

        //paso 6 ejecutar la consulta
        personas = query.getResultList();

        // mostrarPersonas(personas);
        //2.a Consula de persona con id=1
        cb = em.getCriteriaBuilder();

        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        query = em.createQuery(criteriaQuery);
        persona = query.getSingleResult();
        //log.debug(persona);

        //2.b Consula de persona con id=1
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        //la clase predicate permite agregar criterios dinamicamente
        List<Predicate> criterios = new ArrayList<>();

        //Verificamos si tenemos criterios
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        //se agregan los criterios
        if (criterios.isEmpty()) {
            throw new RuntimeException("Sin criterios");
        } else if (criterios.size() == 1) {
            criteriaQuery.where(criterios.get(0));
        }else{
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        query=em.createQuery(criteriaQuery);
        query.setParameter("idPersona",idPersonaParam);
        //se ejecuta el query
        persona=query.getSingleResult();
        
        log.debug(persona);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }
}
