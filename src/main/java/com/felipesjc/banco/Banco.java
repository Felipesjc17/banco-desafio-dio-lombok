package com.felipesjc.banco;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public void ImprimindoDadosBanco() {
		
		System.out.println("=== Dados do Banco e suas contas ===\n"
		+"Banco = " + nome);
		int cont = 1;
		for(Conta lista : contas) {
			
			System.out.println("===Conta " + cont +"===");
			lista.imprimirInfosComuns();
			cont++;
		}
		
	}
	
 
	
}
