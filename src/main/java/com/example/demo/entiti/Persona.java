package com.example.demo.entiti;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String ciudad;

}
