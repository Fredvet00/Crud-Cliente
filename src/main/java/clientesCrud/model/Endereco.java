package clientesCrud.model;

import lombok.Data;

@Data 
public class Endereco {
private Integer cep;
private String lugadouro;
private String bairro;
private String cidade;
private String uf;
private String pais;
}
