package br.com.gft.projetoloja.builder;

import br.com.gft.projetoloja.model.Marca;
import br.com.gft.projetoloja.model.Modelo;
import br.com.gft.projetoloja.model.Videogame;

public class VideogameBuilder {

	private Videogame instancia;
	
	public VideogameBuilder() {
		instancia = new Videogame();
	}
	
	public Videogame construir() {
		return instancia;
	}
	
	public VideogameBuilder comNome(String nome) {
		instancia.setNome(nome);
		return this;
	}
	
	public VideogameBuilder comPreco(double preco) {
		instancia.setPreco(preco);
		return this;
	}
	
	public VideogameBuilder comQtd(int qtd) {
		instancia.setQtd(qtd);
		return this;
	}
	
	public VideogameBuilder comMarca(Marca marca) {
		instancia.setMarca(marca);
		return this;
	}
	
	public VideogameBuilder comModelo(Modelo modelo) {
		instancia.setModelo(modelo);
		return this;
	}
	
	public VideogameBuilder statusUsado(boolean isUsado) {
		instancia.setUsado(isUsado);
		return this;
	}
	
}
