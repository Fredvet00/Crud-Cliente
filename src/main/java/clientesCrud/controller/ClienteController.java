package clientesCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/clientes")
	public List<Cliente> get() {
		return clienteService.get();

	}
	
	@GetMapping("/cliente/{id}")
	public Cliente get(@PathVariable long id) {
		Cliente clienteobj = clienteService.get(id);
		if (clienteobj == null) {
			throw new RuntimeException("Cliente com o id: "+id+", não encontrado");
		}return clienteobj;
	}
	
	
	@PostMapping("/cliente")
	public Cliente save(@RequestBody Cliente clienteobj) {
		clienteService.save(clienteobj);
		return  clienteobj;
		
		
	}

	@DeleteMapping("/cliente/{id}")
	public String delete(@PathVariable long id) {
		clienteService.delete(id);
		return "Cliente com ID: "+id+", deletado com sucesso ";
	
	}
	
}
