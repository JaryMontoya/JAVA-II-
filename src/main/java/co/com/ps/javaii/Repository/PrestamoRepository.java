package co.com.ps.javaii.Repository;

import co.com.ps.javaii.model.Cliente;
import co.com.ps.javaii.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
    Prestamo getPrestamoById(Long id);
}


