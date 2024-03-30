package co.com.ps.javaii.controller;

import co.com.ps.javaii.model.Cliente;
import co.com.ps.javaii.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//TODO
@RequiredArgsConstructor
@RestController //Decir que esta clase es administrada o controlada por SPRING
@RequestMapping("/clientes") //Agregar una ruta para mi clase
public class ClienteController {

    //ResponseEntity nos sirven para dar respuesta a peticiones con estas... 200 404, 500

    private final IClienteService iClienteService;

    //TODO
     /*@GetMapping
       public list<Cliente> getAllClientes ()}
            return null;
      */

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = iClienteService.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente =iClienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setClienteId(id);
        Cliente updatedCliente = iClienteService.updateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        iClienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }


}