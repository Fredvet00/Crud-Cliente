package clientesCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import clientesCrud.model.Cliente;
import clientesCrud.persistencia.dao.ClienteDAO;
@Service
public class ClienteServiceImplementation implements ClienteService {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	
	@Transactional
	public List<Cliente> get() {
		return clienteDAO.get();
	}

	@Transactional
	public Cliente get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void save(Cliente cliente) {
		clienteDAO.save(cliente);
		
	}
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
