package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.negocio.fatec.Controle;

@SuppressWarnings("serial")
public class Agenda implements Serializable {
	public List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void listarClientes() {
		for(Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
		}
	}
	
	public void inserirCliente() {
		System.out.println("Digite um nome para o cliente: ");
		Controle nome = new Controle();
		Controle telefone = new Controle();
		Controle endereco = new Controle();
		Controle cpf = new Controle();
		Cliente c = new Cliente(nome.texto(), telefone.numero(), endereco.texto(), cpf.numero());
		clientes.add(c);
	}
}
