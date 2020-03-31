package projetoloja;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.gft.projetoloja.model.Videogame;
import br.com.gft.projetoloja.repository.Videogames;

public class VideogameTest {

	private Videogame game1;
	private Videogame game2;
	
	@Mock
	private Videogames games;
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
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
	
	@Test
	public void deveSalvarUmVideogame() throws Exception {
		games.salvar(game1);
		verify(games).salvar(game1);		
	}
	
	
}
