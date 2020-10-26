package clientesCrud.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;


@Data
@Entity
public class Role implements GrantedAuthority {

	@Id
	@Column
	private String nomeRole;
	
	@ManyToMany
	@Column
	private List<Usuario> usuario;
	
	@Override
	public String getAuthority() {
		
		return null;
	}

}
