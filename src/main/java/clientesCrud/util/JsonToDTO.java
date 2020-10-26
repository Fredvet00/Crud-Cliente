package clientesCrud.util;

import org.json.JSONObject;

import clientesCrud.DTO.ViaCepDTO;

public interface JsonToDTO {
	
	public ViaCepDTO dataTransferMethod(ViaCepDTO viaCepDTO, JSONObject jsonObject );
	public JSONObject transformarStringEmJson(String string) ;
		
		

}
