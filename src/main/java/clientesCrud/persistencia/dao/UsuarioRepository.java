package clientesCrud.persistencia.dao;
import org.springframework.data.repository.CrudRepository;

import clientesCrud.model.Usuario;
public interface UsuarioRepository extends CrudRepository<Usuario,String> {
	Usuario findBylogin(String login);
}
