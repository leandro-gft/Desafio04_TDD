package br.com.gft.projetoloja.testes;

import static br.com.gft.projetoloja.model.Modelo.ONE;
import static br.com.gft.projetoloja.model.Modelo.SLIM;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.gft.projetoloja.builder.VideogameBuilder;
import br.com.gft.projetoloja.model.Videogame;
import br.com.gft.projetoloja.repository.Videogames;

public class VideogameTest {

	private Videogame v1, v2, v3;
	
	@Mock
	private Videogames games;
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		v1 = new VideogameBuilder().comNome("PS4").comPreco(1800).comQtd(100).comModelo(SLIM).statusUsado(false).construir();
		v2 = new VideogameBuilder().comNome("PS4").comPreco(1000).comQtd(7).comModelo(SLIM).statusUsado(true).construir();
		v3 = new VideogameBuilder().comNome("XBOX").comPreco(1500).comQtd(500).comModelo(ONE).statusUsado(false).construir();
	

	}
	
	@Test
	public void deveCalcularImpostoGameUsado() throws Exception {
		assertEquals(250, v2.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoGameNovo() throws Exception {
		assertEquals(810, v1.calcularImposto(), 0.0001);
		assertEquals(675, v3.calcularImposto(), 0.0001);

	}
	
	@Test
	public void deveSalvarUmVideogame() throws Exception {
		games.salvar(v1);
		verify(games).salvar(v1);		
	}
	
	
}
