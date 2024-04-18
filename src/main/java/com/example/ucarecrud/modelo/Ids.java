package com.example.ucarecrud.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Data
public class Ids {
    @Id
    // Anotación que especifica la generación automática del valor del identificador
    @GeneratedValue(generator = "system-uuid")
    // Configuración del generador de identificadores
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    // Configuración de la columna asociada al identificador en la base de datos
    @Column(length = 32)
    // Anotación que indica que este campo debe estar oculto en la interfaz de usuario
    private String id;

}
