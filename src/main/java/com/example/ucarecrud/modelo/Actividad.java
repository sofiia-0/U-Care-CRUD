package com.example.ucarecrud.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "actividades")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String etiqueta;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaLimite;
    private boolean completada;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    public Actividad() {
        this.fechaCreacion = LocalDateTime.now();
        this.completada = false;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
