package clientesCrud.persistencia.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import clientesCrud.model.Cliente;

@Repository
public class ClienteDAOImplementation implements ClienteDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Cliente> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Cliente> query = currentSession.createQuery("from Cliente", Cliente.class);
		List<Cliente> list = query.getResultList();
		return list;
	}

	@Override
	public Cliente get(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Cliente clienteObj = currentSession.get(Cliente.class, id);
		return clienteObj;
	}
	

	@Override
	public void save(Cliente cliente) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(cliente);

	}

	@Override
	public void delete(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Cliente clienteOBJ =currentSession.get(Cliente.class, id);
		currentSession.delete(clienteOBJ);
	}

	

	

}
