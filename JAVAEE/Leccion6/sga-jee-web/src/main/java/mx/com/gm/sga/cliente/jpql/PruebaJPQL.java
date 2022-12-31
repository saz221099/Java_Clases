/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.jpql;

import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Query;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author carlo
 */
public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1.Consulta de todos los objetos de tipo persona
        log.debug("1.Consulta de todas las personas");
        //  jpql = "select p from Persona p";
        jpql = "SELECT p FROM Persona p";
        //  personas =  em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //2.Consulta Persona con id=1
        log.debug("2.Consulta de persona con id=1");
        jpql = "select p from Persona p where p.idPersona = 1";
        //persona =  (Persona)em.createQuery(jpql).getSingleResult();
        // log.debug(persona);

        //3.Objeto persona filtrado por nombre
        log.debug("3.Consulta de persona filtrado por nombre");
        jpql = "select p from Persona p where p.nombre = 'carlos'";
        // personas =  (List<Persona>) em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        //4.Consulta para crear un arreglo (tupla) de tipo object de 3 columnas
        log.debug("4.tupla de 3 columnas");
        jpql = "select p.nombre as Nombre,p.apellido as Apellido,p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
//            log.debug("nombre : "+nombre+" ,apellido"+apellido+" ,email "+email);

        }

        //5.Consulta objeto object Persona y id en 2 columnas
        log.debug("5.Arreflo Persona y id en 2 columnas");
        jpql = "select p,p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("objeto obtenido"+persona);
            //log.debug("id"+idPersona);
        }

        //6.Consulta de todas las personas
        jpql = "select new mx.com.gm.sga.domain.Persona(p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
        // mostrarPersonas(personas);

        //7 Regresa valor minimi y maximo de idPersona
        jpql = "select min(p.idPersona) as MinId,max(p.idPersona) as MaxId,count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer IdMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            //log.debug("idMin: "+idMin+", idMax: "+IdMax+" ,contador: "+count);

        }

        //8 personas con nombres distintos
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        // log.debug(" #personas con nombre distinto "+contador);

        //9.Concatenar nombre y apellido y convertir a mayúsculas
        jpql = "select CONCAT(p.nombre,' ',p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for (String nombreCompleto : nombres) {
            // log.debug(nombreCompleto);
        }

        //10.Obtiene objeto persona con id igual al parametro proporcionado
        int idPersona = 2;
        jpql = "Select p from Persona p where p.idPersona=:id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
        //log.debug(persona);

        //11. Personas que contengan letra a en su nombre
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        String parametro = "%a%";
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametro);
        personas = q.getResultList();
        for (Persona p : personas) {
            // log.debug(p);
        }
        //12.Uso de between
        jpql = "select p from Persona p where p.idPersona between 1 and 2";
        personas = em.createQuery(jpql).getResultList();
        // mostrarPersonas(personas);

        //13.Uso de ordenamiento
        jpql = "select p from Persona p where p.idPersona>1 order by p.nombre desc,p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
        // mostrarPersonas(personas);

        //14.Uso de subquery
        jpql = "select p from Persona p where p.idPersona in(select min(p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        // mostrarPersonas(personas);

        //15.Uso de join con lazy loading
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);

        //16.Uso de left join con eager loading
        jpql = "select u from Usuario u left join fetch u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            log.debug(u);
        }
    }
}
