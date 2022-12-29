/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;

/**
 *
 * @author carlo
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        //String elemento =miLista.get(0);
     //   System.out.println("elemento = " + elemento);
        
       // Imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //Imprimir(miSet);

        Map<String,String> miMapa = new HashMap<>();
       miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");

        //String elemento = miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);

        Imprimir(miMapa.keySet());
        Imprimir(miMapa.values());
    }

    public static void Imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
