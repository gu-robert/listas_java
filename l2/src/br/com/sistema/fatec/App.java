package br.com.sistema.fatec;

import br.com.modelo.fatec.Agenda;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Agenda ag = new Agenda();
		Controle c = new Controle();
		try {
			ag = c.carregarBinario();
		} catch (Exception e) {
			System.out.println("Não foi possível ler um arquivo salvo...");
			ag = new Agenda();
		}
		int opcao = 100;
		while(opcao != 0) {
			menu.menu();
			Controle ctrl = new Controle();
			opcao = ctrl.opcao();
			if(opcao == 1) {
				ag.inserirCliente();
			}
			if(opcao == 2) {
				ag.listarClientes();
			}
		}
		c = new Controle();
		try {
			c.s
		}
		
	}
}
