package edu.ifsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(
			@RequestParam(name = "nome", required = false) String usuario, 
			Model model
			) {
		if (usuario == null) {
			usuario = "anônimo";
		}
		
		model.addAttribute("nome", usuario);
		
		//Algum processamento aqui
		return "hello";
	}
}
