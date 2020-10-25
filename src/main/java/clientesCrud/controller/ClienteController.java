package clientesCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clientesCrud.model.Cliente;
import clientesCrud.service.ClienteService;


@RestController
@RequestMapping( "/api" )
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping("/clientes")
	public List<Cliente> get() {
		return clienteService.get();

	}
	
	@PostMapping("/cliente")
	public Cliente save(@RequestBody Cliente clienteobj) {
		clienteService.save(clienteobj);
		return  clienteobj;
	}

}
