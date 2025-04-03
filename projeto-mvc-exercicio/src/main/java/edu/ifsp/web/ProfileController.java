package edu.ifsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {
	
	@GetMapping("/template")
	public String template(
			@RequestParam(name = "nome", required = false) String usuario,
			@RequestParam(name = "profissao", required = false) String profissao,
			@RequestParam(name = "nome", required = false) String telefone,
			Model model
			) {
		if (usuario == null) {
			usuario = "anônimo";
		}
		if (profissao == null) {
			profissao = "herdeiro";
		}
		if (telefone == null) {
			telefone = "indefinido";
		}
		
		model.addAttribute("nome", usuario);
		model.addAttribute("profissao", profissao);
		model.addAttribute("telefone", telefone);
		
		//Algum processamento aqui
		return "template";
	}
}
