package co.com.ps.javaii.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Prestamos")

public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "loan_id")
    private Long loanId;


    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Cliente cliente;

    private BigDecimal monto;

    private BigDecimal tasadInteres;

    private Integer plazo;

    private LocalDate fechadeinicio;

    private String estado;

    public void setPrestamoId(Long id) {
    }
}
