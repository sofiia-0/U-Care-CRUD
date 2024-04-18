package com.example.ucarecrud.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import javax.validation.constraints.Size;

@Entity
@Data
public class EstadoAnimo extends Ids {
    //enum dentro de estado de animo
    public enum ESTADO {Feliz, Bien, Cansado, Estresado, Triste}

    private ESTADO estado;

    @Column(length = 140)
    @Size(max = 140, message = "El comentario debe tener como máximo 140 caracteres")
    private String comentario;

}
