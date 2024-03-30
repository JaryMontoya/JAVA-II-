package co.com.ps.javaii.service;
import co.com.ps.javaii.Repository.PrestamoRepository;
import co.com.ps.javaii.model.Cliente;
import co.com.ps.javaii.model.Prestamo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;

    @Override
    public Prestamo getPrestamoById(Long id) {
        return prestamoRepository.getPrestamoById(id);
    }

    @Override
    public Prestamo registrar(Prestamo prestamo) {
        return null;
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {
    }

}
