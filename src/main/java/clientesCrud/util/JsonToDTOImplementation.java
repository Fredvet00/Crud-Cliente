package clientesCrud.util;

import org.json.JSONException;
import org.json.JSONObject;

import clientesCrud.DTO.ViaCepDTO;


public class JsonToDTOImplementation implements JsonToDTO {
	
	JSONObject jsonObject = new JSONObject();
	ViaCepDTO viaCepDTO = new ViaCepDTO();

	public ViaCepDTO dataTransferMethod(ViaCepDTO viaCepDTO, JSONObject jsonObject ) {
		viaCepDTO.setCep(jsonObject.get("cep").toString());
		viaCepDTO.setLogradouro(jsonObject.get("logradouro").toString());
		viaCepDTO.setComplemento(jsonObject.get("complemento").toString());
		viaCepDTO.setBairro(jsonObject.get("bairro").toString());
		viaCepDTO.setLocalidade(jsonObject.get("localidade").toString());
		viaCepDTO.setUf(jsonObject.get("uf").toString());
		viaCepDTO.setIbge(jsonObject.get("ibge").toString());
		viaCepDTO.setGia(jsonObject.get("gia").toString());
		viaCepDTO.setDdd(jsonObject.get("ddd").toString());
		viaCepDTO.setSiafi(jsonObject.get("siafi").toString());
		
		return viaCepDTO;
	}
		
	
	public JSONObject transformarStringEmJson(String string) { // transforma string em json
		try {
			JSONObject jsonObject = new JSONObject(string);
			return jsonObject;
		} catch (JSONException err) {
			System.out.println("Error" + err.toString());
		}
		return null;
	}

}
