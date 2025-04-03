package edu.ifsp.cadastro.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.ifsp.cadastro.cliente.Cliente;

@Controller
public class ClienteController {
	
	@GetMapping("/exibir")
	public String exibir(Model model) {
		Cliente cliente = new Cliente("João", "joao@ifsp.edu.br", false);
		
		model.addAttribute("cliente", cliente);
		
		return "cliente";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Cliente> all = List.of (
				new Cliente("Pedrinho", "pedrinho@ifsp.edu.br", true),
				new Cliente("Narizinho", "nariz@ifsp.edu.br", false),
				new Cliente("Emília", "emilia@ifsp.edu.br", true)
				);
		
		model.addAttribute("clientes", all);
		
		return "listar";
	}
}