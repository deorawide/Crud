package com.example.demo.services;

import com.example.demo.entiti.MemoriaBDD;
import com.example.demo.entiti.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class Crudservice {


MemoriaBDD datosdb = new MemoriaBDD();


    public List<Persona> dameDatos(){
    List<Persona> personas = this.datosdb.personas.stream().toList();
    return personas;
    }

    public String tomaDatos(Persona persona) {
        List<Persona> personas = this.datosdb.personas.stream().toList();
        for (int i = 0; i < personas.size(); i++) {


            if (persona.getId() == personas.get(i).getId()) {
                return "No puedes guardar un registro con el mismo ID";
            }
        }
        this.datosdb.personas.add(persona);
        return "Registro agregado correctamente";
    }


    public String acualizaDatos(Persona persona){
        List<Persona> personas = this.datosdb.personas.stream().toList();
        for (int i = 0; i < personas.size(); i++) {


            if (persona.getId() == personas.get(i).getId()) {
                this.datosdb.personas.stream().toList().get(i).setNombre(persona.getNombre());
                this.datosdb.personas.stream().toList().get(i).setApellidos(persona.getApellidos());
                this.datosdb.personas.stream().toList().get(i).setEdad(persona.getEdad());
                this.datosdb.personas.stream().toList().get(i).setCiudad(persona.getCiudad());
                return "Se ha cambiado la informacion del registro: " +persona.getId();
            }
        }

        return "No se encontro el ID deseado ";

    }

    public String borraDatos(Persona persona){
        List<Persona> personas = new ArrayList<>(this.datosdb.personas.stream().toList());
        for (int i = 0; i < personas.size(); i++) {


            if (persona.getId() == this.datosdb.personas.stream().toList().get(i).getId()) {
                personas.remove(i);
                this.datosdb.elimina(persona);

                return "Se borro el registro: " +persona.getId();
            }
        }

        return "No se encontro el ID deseado ";

    }

}
