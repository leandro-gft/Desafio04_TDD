package br.com.gft.projetoloja.model;

import br.com.gft.projetoloja.interfaces.Imposto;

public class Videogame extends Produto implements Imposto {

	private Marca marca;
	private Modelo modelo;
	private boolean isUsado;

//	public Videogame(double preco, boolean isUsado) {
//		super(preco);
//		this.isUsado = isUsado;
//	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public double calcularImposto() {
		if (isUsado == true)
			return 0.25 * getPreco();
		return 0.45 * getPreco();
	}

}
