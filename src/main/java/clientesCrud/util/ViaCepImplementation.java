package clientesCrud.util;

import org.springframework.web.client.RestTemplate;


public class ViaCepImplementation implements ViaCep {


		
		public String requestMaker(String cep) {
			String uri ="https://viacep.com.br/" + cep + "/json/";
			RestTemplate restTemplate = new RestTemplate();
			String result = restTemplate.getForObject(uri, String.class);	
			return result;
		}
		
}
