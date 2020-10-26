package clientesCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Cliente {
	
	@Id
	  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;

	@Column
	private String endereco;
	
	@Column
	private Integer telefone;
	
	@Column
	private String email;
	
	

}
