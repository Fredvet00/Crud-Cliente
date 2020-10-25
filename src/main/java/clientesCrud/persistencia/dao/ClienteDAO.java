package clientesCrud.persistencia.dao;


import java.util.List;

import clientesCrud.model.Cliente;

public interface ClienteDAO {
	List<Cliente> get();
	
	Cliente get(Long id);
	
	void save(Cliente cliente);
	
	void delete(Long id);

}
