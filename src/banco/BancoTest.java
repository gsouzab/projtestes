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
	}
	
	@Test
	public void testOne() {
		// Test Path = [1, 2]		
		assertEquals(0, banco.banco(3, 1, tempos));		
	}
	
	@Test
	public void testTwo() {
		// Test Path = [1, 3, 4, 5]		
		assertEquals(0, banco.banco(0, 1, tempos));		
	}
	
	@Test
	public void testThree() {
		// Test Path = [1, 3, 4, 6, 7, 8, 11, 13, 4, 5]
		
		tempos = new int[2][2];
		tempos[0][0] = 0;
		tempos[0][1] = 30;
		tempos[1][0] = 0;
		tempos[1][1] = 10;
		
		assertEquals(1, banco.banco(1, 2, tempos));		
	}
	
}
