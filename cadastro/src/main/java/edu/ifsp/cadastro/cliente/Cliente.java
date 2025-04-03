package edu.ifsp.cadastro.cliente;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {
	private String name;
	private String email;
	private boolean ativo;
}
