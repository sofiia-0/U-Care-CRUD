package com.example.ucarecrud.modelo;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Etiqueta extends Ids {
    String titulo;


}
