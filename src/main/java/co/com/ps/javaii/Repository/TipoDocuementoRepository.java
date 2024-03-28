package co.com.ps.javaii.Repository;

import co.com.ps.javaii.model.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocuementoRepository extends JpaRepository<TipoDocumento,Long> {

}
