package br.com.gft.projetoloja.model;

import br.com.gft.projetoloja.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private Tema tema;
	private int qtdPag;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	public double calcularImposto() {
		if (tema != Tema.DIDATICO)
			return 0.1 * getPreco();
		return 0;

	}

}
