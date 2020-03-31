package br.com.gft.projetoloja.builder;

import br.com.gft.projetoloja.model.Livro;
import br.com.gft.projetoloja.model.Tema;

public class LivroBuilder {

	private Livro instancia;
	
	public LivroBuilder() {
		instancia = new Livro(); 
	}
	
	public Livro construir() {
		return instancia;
	}
	
	public LivroBuilder comNome(String nome) {
		instancia.setNome(nome);
		return this;
	}
	
	public LivroBuilder comPreco(double preco) {
		instancia.setPreco(preco);
		return this;
	}
	
	public LivroBuilder comQtd(int qtd) {
		instancia.setQtd(qtd);
		return this;
	}
	
	public LivroBuilder comAutor(String autor) {
		instancia.setAutor(autor);
		return this;
	}
	
	public LivroBuilder comTema(Tema tema) {
		instancia.setTema(tema);
		return this;
	}
	
	public LivroBuilder comQtdPag(int qtdPag) {
		instancia.setQtdPag(qtdPag);
		return this;
	}
	
	
}
