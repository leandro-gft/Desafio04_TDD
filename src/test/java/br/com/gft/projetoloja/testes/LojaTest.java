package br.com.gft.projetoloja.testes;

import static br.com.gft.projetoloja.model.Modelo.ONE;
import static br.com.gft.projetoloja.model.Modelo.SLIM;
import static br.com.gft.projetoloja.model.Tema.DIDATICO;
import static br.com.gft.projetoloja.model.Tema.FANTASIA;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.projetoloja.builder.LivroBuilder;
import br.com.gft.projetoloja.builder.LojaBuilder;
import br.com.gft.projetoloja.builder.VideogameBuilder;
import br.com.gft.projetoloja.model.Livro;
import br.com.gft.projetoloja.model.Loja;
import br.com.gft.projetoloja.model.Videogame;

public class LojaTest {

	private Livro l1, l2, l3;
	private Videogame v1, v2, v3;
	private Loja americanas;
	
	private List<Livro> livros;
	private List<Videogame> games;


	@Before
	public void setup() {
		livros = new ArrayList<Livro>();
		games = new ArrayList<Videogame>();

		americanas = new LojaBuilder().comEstoqueLivro(livros).comEstoqueVideogames(games).construir();
		
		l1 = new LivroBuilder().comNome("Harry Potter").comPreco(40).comQtd(50).comTema(FANTASIA).construir();
		l2 = new LivroBuilder().comNome("Senhor dos Aneis").comPreco(60).comQtd(30).comTema(FANTASIA).construir();
		l3 = new LivroBuilder().comNome("Java POO").comPreco(20).comQtd(50).comTema(DIDATICO).construir();
		
		v1 = new VideogameBuilder().comNome("PS4").comPreco(1800).comQtd(100).comModelo(SLIM).statusUsado(false).construir();
		v2 = new VideogameBuilder().comNome("PS4").comPreco(1000).comQtd(7).comModelo(SLIM).statusUsado(true).construir();
		v3 = new VideogameBuilder().comNome("XBOX").comPreco(1500).comQtd(500).comModelo(ONE).statusUsado(false).construir();
	}

	@Test
	public void deveListarLivrosERetornarQuantidadeDeItens() throws Exception {

		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		assertEquals(3, americanas.listaLivros().size());

				
	}
	
	@Test
	public void deveListarVideogamesERetornarQuantidadeDeItens() throws Exception {

		games.add(v1);
		games.add(v2);
		games.add(v3);

		assertEquals(3, americanas.listaVideogames().size());


	}

		
	
}
