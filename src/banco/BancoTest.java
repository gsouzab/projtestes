package banco;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BancoTest {

	public Banco banco = null;
	int[][] tempos;
	
	@Before
	public void setUp() {
		banco = new Banco();
		tempos = new int[2][2];
		tempos[0][0] = 1;
		tempos[0][1] = 1;
	}
	
	@Test
	public void testOne() {
		// Test Path = [1, 2]		
		assertEquals(0, banco.banco(3, 1, tempos));		
	}
	
	@Test
	public void testTwo() {
		// Test Path = [1, 3, 4, 5]		
		assertEquals(0, banco.banco(0, 2, tempos));		
	}
	
}
