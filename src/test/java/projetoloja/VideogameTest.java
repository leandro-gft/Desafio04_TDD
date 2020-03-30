package projetoloja;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.projetoloja.model.Livro;
import br.com.gft.projetoloja.model.Tema;
import br.com.gft.projetoloja.model.Videogame;

public class VideogameTest {

	private Videogame game1;
	private Videogame game2;

	@Before
	public void setup() {
		game1 = new Videogame(1000, true);
		game2 = new Videogame(1000, false);

	}
	
	@Test
	public void deveCalcularImpostoGameUsado() throws Exception {
		assertEquals(250, game1.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoGameNovo() throws Exception {
		assertEquals(450, game2.calcularImposto(), 0.0001);
	}
	
	
	
}
