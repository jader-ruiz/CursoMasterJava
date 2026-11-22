package com.jeruiz.colecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {
    static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();

        // El HashMap tiene una llave con su valor

        persona.put("nombre", "Pepe");
        persona.put("apellido", "Pork");
        persona.put("email", "pepepork@mail.com");
        persona.put("edad", "23");

        System.out.println("persona = " + persona);

        // persona = {apellido=Pork, nombre=Pepe, edad=23, email=pepepork@mail.com}
        // Como se puede ver la llave seria lo primero y el valor despues del '='
        // No se puede repetir la llave, pero el valor si. Lo ultimo que sea repetido es lo que deja

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String b = persona.remove("apellido");
        System.out.println(b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsValue("Pepe");
        System.out.println(b2);

        Collection<String> valores = persona.values();
        for(String v: valores) System.out.println(v);
        // No es ordenado

        Map<String, Object> persona2 = new HashMap<>();
        persona2.put("nombre","Pepe");
        persona2.put("apellido","Pork");

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","florida");

        persona2.put("direccion",direccion);

        System.out.println(persona2);

        // Se puede anidar un hashMap en otro hashMap, como una relacion de clases

    }
}
