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

	public List<Livro> listaLivros() {
//		for (Livro livro : livros) {
//			System.out.println("Nome: " + livro.getNome() + " - Preço: R$ " + livro.getPreco() + " - Qtd: "
//					+ livro.getQtd() + " em estoque.");
//		}
		return livros;

	}

	public List<Videogame> listaVideogames() {
//			for (Videogame game : games) {
//				System.out.println("Nome: "+game.getNome()+" - Modelo: " + game.getModelo() + " - Preço: R$ " + game.getPreco() + " - Qtd: "
//						+ game.getQtd() + " em estoque.");
//		}
		return games;

	}

	public double calculaPatrimonio() {
		double total = 0;
		for (Livro livro : livros)
			total += livro.getPreco() * livro.getQtd();
		for (Videogame game : games)
			total += game.getPreco() * game.getQtd();

		return total;

	}

}
