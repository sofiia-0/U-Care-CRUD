package com.example.ucarecrud.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Estudiante {
    @Id
    Integer CIF;
    String nombre;
    String apellido;
    String telefono;
    String email;
    String Carrera;
    String Contrasenia;

}
