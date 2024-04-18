package com.example.ucarecrud.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class EstadoAnimo extends Ids {
    //enum dentro de estado de animo
    public enum ESTADO {Feliz, Bien, Cansado, Estresado, Triste};

    private ESTADO estado;

    @Column(length = 240)
    private String comentario;

}
