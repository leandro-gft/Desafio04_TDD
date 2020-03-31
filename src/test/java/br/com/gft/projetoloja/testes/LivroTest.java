package br.com.gft.projetoloja.testes;

import static br.com.gft.projetoloja.model.Tema.DIDATICO;
import static br.com.gft.projetoloja.model.Tema.FANTASIA;
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

	private Livro l1, l2, l3;

	@Mock
	private Livros livros;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		l1 = new LivroBuilder().comNome("Harry Potter").comPreco(40).comQtd(50).comTema(FANTASIA).construir();
		l2 = new LivroBuilder().comNome("Senhor dos Aneis").comPreco(60).comQtd(30).comTema(FANTASIA).construir();
		l3 = new LivroBuilder().comNome("Java POO").comPreco(20).comQtd(50).comTema(DIDATICO).construir();

	}
	
	@Test
	public void deveCalcularImpostoLivroDidatico() throws Exception {
		assertEquals(0, l3.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoLivros() throws Exception {
		assertEquals(6, l2.calcularImposto(), 0.0001);
		assertEquals(4, l1.calcularImposto(), 0.0001);

	}
	
	@Test
	public void deveSalvarUmLivro() throws Exception {
		livros.salvar(l1);
		verify(livros).salvar(l1);		
	}
	
	
	
}
