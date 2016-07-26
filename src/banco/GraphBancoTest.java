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
	}

	@Test
	public void CT1() {
		//TP = [1,2]
		tempos = new int[2][2];
		tempos[0][0] = 0;
		tempos[0][1] = 1;
		tempos[1][0] = 3;
		tempos[1][1] = 1;
		assertEquals(0, banco.banco(3, 1, tempos));
	}

	
	@Test
	public void CT2() {	
		//TP = [1, 3, 4, 6, 7, 9, 8, 10, 13, 4, 5]
		tempos = new int[2][2];
		tempos[0][0] = 0;
		tempos[0][1] = 20;
		tempos[1][0] = 50;
		tempos[1][1] = 20;
		
		assertEquals(0, banco.banco(1, 2, tempos));		
	}
	
	@Test
	public void CT3() {	
		//TP = [1, 3, 4, 6, 7, 8, 10, 13, 4, 6, 7, 8, 10, 12, 13, 4, 5]
		tempos = new int[3][2];
		tempos[0][0] = 0;
		tempos[0][1] = 20;
		tempos[1][0] = 0;
		tempos[1][1] = 20;
		tempos[2][0] = 0;
		tempos[2][1] = 10;
		
		assertEquals(1, banco.banco(1, 3, tempos));		
	}

	@Test
	public void CT4() {	
		//TP = [1, 3, 4, 6, 7, 8, 11, 13, 4, 6, 7, 8, 10, 13, 4, 6, 7, 9, 7, 9, 8, 11, 13, 4, 5]
		tempos = new int[4][2];
		tempos[0][0] = 0;
		tempos[0][1] = 10;
		tempos[1][0] = 0;
		tempos[1][1] = 10;
		tempos[2][0] = 0;
		tempos[2][1] = 10;
		tempos[3][0] = 50;
		tempos[3][1] = 10;
		
		assertEquals(0, banco.banco(3, 4, tempos));		
	}

}
