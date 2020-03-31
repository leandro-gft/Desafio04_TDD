package br.com.gft.projetoloja.builder;

import java.util.List;

import br.com.gft.projetoloja.model.Livro;
import br.com.gft.projetoloja.model.Loja;
import br.com.gft.projetoloja.model.Videogame;

public class LojaBuilder {
	
private Loja instancia;
	
	public LojaBuilder() {
		instancia = new Loja(); 
	}
	
	public Loja construir() {
		return instancia;
	}
	
	public LojaBuilder comNome(String nome) {
		instancia.setNome(nome);
		return this;
	}
	
	public LojaBuilder comCNPJ(String cnpj) {
		instancia.setCnpj(cnpj);
		return this;
	}
	
	public LojaBuilder comEstoqueLivro(List<Livro> livros) {
		instancia.setLivros(livros);
		return this;
	}
	
	public LojaBuilder comEstoqueVideogames(List<Videogame> games) {
		instancia.setGames(games);
		return this;
	}
	

}
