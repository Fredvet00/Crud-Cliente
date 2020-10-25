package clientesCrud.service;

import java.util.List;

import clientesCrud.model.Cliente;

public interface ClienteService {
	
	List<Cliente> get();
	
	Cliente get(Long id);
	
	void save(Cliente cliente);
	
	void delete(Long id);

}
