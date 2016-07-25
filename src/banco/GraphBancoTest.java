package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GraphBancoTest {

	public Banco banco = null;
	int[][] tempos;
	
	@Before
	public void setUp() {
		banco = new Banco();
		tempos = new int[2][2];
		tempos[0][0] = 0;
		tempos[0][1] = 1;
		tempos[1][0] = 3;
		tempos[1][1] = 1;
	}
	
	@Test
	public void CT1() {
		assertEquals(0, banco.banco(3, 1, tempos));
	}
	
	@Test
	public void CT2() {
		tempos[0][0] = 0;
		tempos[0][1] = 20;
		tempos[1][0] = 9;
		tempos[1][1] = 10;
		assertEquals(0, banco.banco(1, 2, tempos));
	}

}
