package br.com.gft.projetoloja.testes;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.gft.projetoloja.builder.LivroBuilder;
import br.com.gft.projetoloja.model.Livro;
import br.com.gft.projetoloja.model.Tema;
import br.com.gft.projetoloja.repository.Livros;

public class LivroTest {

	private Livro livro1;
	private Livro livro2;

	@Mock
	private Livros livros;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		livro1 = new LivroBuilder().comPreco(100).comTema(Tema.DIDATICO).construir();
		livro2 = new LivroBuilder().comPreco(100).comTema(Tema.OUTROS).construir();

	}
	
	@Test
	public void deveCalcularImpostoLivroDidatico() throws Exception {
		assertEquals(0, livro1.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoLivros() throws Exception {
		assertEquals(10, livro2.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveSalvarUmLivro() throws Exception {
		livros.salvar(livro1);
		verify(livros).salvar(livro1);		
	}
	
	
	
}
