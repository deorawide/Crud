package com.example.demo.entiti;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;



public class MemoriaBDD {
    public static Set<Persona> personas;

    static{
        //Inicilializar

       personas = new HashSet<Persona>();
        Persona persona1 = new Persona(1,"luis","leyva",33,"toluca");
        Persona persona2 = new Persona(2,"juan","leyva",33,"toluca");
        Persona persona3 = new Persona(3,"jose","leyva",33,"toluca");
        Persona persona4 = new Persona(4,"lujan","leyva",33,"toluca");

       personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

    }
    public void elimina(Persona persona){
        this.personas.remove(persona);
    }

}
