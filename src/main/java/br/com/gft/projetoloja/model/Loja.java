package br.com.gft.projetoloja.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<Videogame> games;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Videogame> getGames() {
		return games;
	}
	public void setGames(List<Videogame> games) {
		this.games = games;
	}
	public void listaLivros() {
	
	}
	
	
}
