package clientesCrud.Security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import clientesCrud.model.Usuario;
import clientesCrud.persistencia.dao.UsuarioRepository;
@Repository
@Transactional
public class MyUserDetailsServiceImple implements UserDetailsService{
	private UsuarioRepository ur;
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = ur.findBylogin(login);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario não encontrado!");
		}
		return new User(usuario.getUsername(),usuario.getPassword(),true,true,true,true,usuario.getAuthorities());
	}

}
