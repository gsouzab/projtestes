package colisaoRetangulos;

import static org.junit.Assert.*;
import triangulo.*;

import org.junit.Before;
import org.junit.Test;

public class DeteccaoColicaoTest {

	public DeteccaoColisao dc = null;
	
	@Before
	public void setUp() {
		dc = new DeteccaoColisao();
	}
	
	@Test
	public void testIguais() {
		assertEquals(1, dc.colisao(0, 0, 1, 1, 0, 0, 1, 1));		
	}
	
	@Test
	public void testDentro() {
		assertEquals(1, dc.colisao(10, 18, 1048,3052,58, 176,523, 799));		
	}
	
	@Test
	public void testNaoTocam() {
		assertEquals(0, dc.colisao(50428, 40725, 200310, 375928, 35, 18, 1475, 3472));		
	}
	
	@Test
	public void testIntersecaoLateral() {
		assertEquals(1, dc.colisao(10, 22, 18, 36, 18, 22, 37,36));		
	}
	
	@Test
	public void testIntersecaoUmPonto() {		
		assertEquals(1, dc.colisao(325, 200, 472, 700, 472, 700, 618, 1204));		
	}
	
	@Test
	public void testIntersecaoDoisPontos() {		
		assertEquals(1, dc.colisao(120, 100,182, 135, 152, 110, 214, 170));		
	}
	
	@Test
	public void testIntersecaoQuatroPontos() {	
		assertEquals(1, dc.colisao(10, 10, 100, 1000, 20, 0, 50, 5000));		
	}
	
}
