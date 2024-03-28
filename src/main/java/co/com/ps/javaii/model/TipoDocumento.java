package co.com.ps.javaii.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class TipoDocumento {

    private Long id;
    private String abreviatura;
    private String descripcion;


}
