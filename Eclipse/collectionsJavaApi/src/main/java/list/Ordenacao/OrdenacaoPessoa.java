package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	//atributo
	
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	
	public void adicionarPessoa(String nome, int idade , double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenadoPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Matheus", 28, 1.71);
		ordenacaoPessoa.adicionarPessoa("Matheus2", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Matheus3", 25, 1.61);
		ordenacaoPessoa.adicionarPessoa("Matheus4", 16, 1.71);
		
		System.out.println(ordenacaoPessoa.ordenadoPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
	}
}
