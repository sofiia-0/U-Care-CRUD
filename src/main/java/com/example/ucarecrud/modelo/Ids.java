package com.example.ucarecrud.modelo;
import jakarta.persistence.*;
import lombok.Data;


@MappedSuperclass
@Data
public class Ids {

    @Id
    // Anotación que especifica la generación automática del valor del identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //unique para que no se repita y nullable pa que no sea nulo
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;


}
