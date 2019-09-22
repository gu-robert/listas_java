package br.com.negocio.fatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import br.com.modelo.fatec.Agenda;
import br.com.modelo.fatec.Cliente;

public class Controle {
	public Scanner scanner;
	
	public Controle() {
		scanner = new Scanner(System.in);		
	}
	
	public int opcao() {
		int op = scanner.nextInt();
		return op;
	}
	
	public String texto() {
		String t = scanner.nextLine();
		return t;
	}
	
	public int numero() {
		int n = scanner.nextInt();
		return n;
	}
	
	public Agenda carregarBinario() throws Exception{
		File arq = new File("/home/gustavo/Desktop/agenda.txt");
		FileInputStream entrada = new FileInputStream(arq);
		ObjectInputStream leitor = new ObjectInputStream(entrada);
		Object ob = leitor.readObject();
		leitor.close();
		Agenda ag = (Agenda) ob;
		return ag;
	}
	
	public void salvarBinario(Agenda ag) throws Exception {
		File arq = new File("/home/gustavo/Desktop/agenda.txt");
		FileOutputStream saida = new FileOutputStream(arq);
		ObjectOutputStream escritor = new ObjectOutputStream(saida);
		escritor.writeObject(ag);
		escritor.close();
	}
	
	public void carregar(Agenda ag) throws Exception {
		File arq = new File("/home/gustavo/Desktop/agenda.txt");
		FileReader rd = new FileReader(arq);
		BufferedReader brd = new BufferedReader(rd);
		String texto = brd.readLine();
		while(texto != null) {
			Cliente c = new Cliente(texto, 0, texto, 0); //terminar de implementar
			ag.clientes.add(c);
			texto = brd.readLine();
		}
		brd.close();
	}
	
	public void salvar(Agenda ag) throws IOException {
		
	}
}
