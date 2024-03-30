package co.com.ps.javaii.service;

import co.com.ps.javaii.model.Cliente;
import co.com.ps.javaii.model.Prestamo;

public interface IPrestamoService {


    Prestamo getPrestamoById(Long id);

    Prestamo registrar(Prestamo prestamo);

    Prestamo createPrestamo(Prestamo prestamo);

    Prestamo updatePrestamo(Prestamo prestamo);

    void deletePrestamo (Long id);

}

