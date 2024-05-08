package com.example.demo.controller;


import com.example.demo.entiti.Persona;
import com.example.demo.services.Crudservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
@CrossOrigin
public class Crud {

    @Autowired
    Crudservice crudservice;






@GetMapping("/consulta")
public List<Persona>  consulta(){
    return crudservice.dameDatos();
}

    @PostMapping("/envia")
    public String   envia(@RequestBody Persona persona){
   return crudservice.tomaDatos(persona);

    }


    @PutMapping("/actualiza")
    public String   actualiza(@RequestBody Persona persona){
        return crudservice.acualizaDatos(persona);
    }
    @DeleteMapping("/borra")
    public String   borra(@RequestBody Persona persona){
        return crudservice.borraDatos(persona);
    }


}



