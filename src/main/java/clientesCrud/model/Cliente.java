package clientesCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Cliente {
	
	@Id
	  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="usuario_id")
	private Long id;
	
	@Column(name="usuario_nome")
	private String nome;
	
	@Column(name="usuario_cpf")
	private String cpf;

	@Column(name="usuario_endereco") //alterar para classe ENDERECO e  usar no DB . list?
	private String endereco;
	
	@Column(name="usuario_telefone")
	private Integer telefone;
	
	@Column(name="usuario_email")
	private String email;
	
	

}
