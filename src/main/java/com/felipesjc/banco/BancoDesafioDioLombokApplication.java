package com.felipesjc.banco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDesafioDioLombokApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BancoDesafioDioLombokApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
			
		List<Conta> contas = new ArrayList<>(); 
		contas.add(cc);
		contas.add(poupanca);
		
		Banco banco = new Banco("Itaú", contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println("");
		poupanca.imprimirExtrato();
		System.out.println("");
		banco.ImprimindoDadosBanco();
		
	}

	
	
}
