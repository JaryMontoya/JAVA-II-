package co.com.ps.javaii.Repository;

import co.com.ps.javaii.Repository.ClienteRepository;
import co.com.ps.javaii.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}