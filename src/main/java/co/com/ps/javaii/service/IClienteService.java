package co.com.ps.javaii.service;

import co.com.ps.javaii.model.Cliente;


public interface IClienteService {

    Cliente getClienteById(Long id);

    Cliente registrar(Cliente cliente);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(Long id);

}