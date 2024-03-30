package co.com.ps.javaii.controller;

import co.com.ps.javaii.model.Prestamo;
import co.com.ps.javaii.service.IPrestamoService;
import co.com.ps.javaii.service.PrestamoService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/prestamos")
@RequiredArgsConstructor
public class PrestamoController {

    private final PrestamoService prestamoService;

    //TODO
     /*@GetMapping
       public list<Prestamo> getAllPrestamos ()}
            return null;
      */

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Prestamo prestamo = prestamoService.getPrestamoById(id);
        return ResponseEntity.ok(prestamo);
    }

    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo = prestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> updatePrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        prestamo.setPrestamoId(id);
        Prestamo updatedPrestamo = prestamoService.updatePrestamo(prestamo);
        return ResponseEntity.ok(updatedPrestamo);
    }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        IPrestamoService.deletePrestamo(id);
    return ResponseEntity.noContent().build();
}


