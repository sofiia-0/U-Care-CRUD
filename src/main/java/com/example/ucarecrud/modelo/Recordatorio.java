package com.example.ucarecrud.modelo;

import jakarta.persistence.Entity;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
public class Recordatorio extends Ids{

    private LocalDateTime fechaHora;

    private String nombreActividad;

    private boolean realizado;

}
