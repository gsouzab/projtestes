package banco;

import static org.junit.Assert.*;

import java.util.Random;

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
	public void CT1() {	
		tempos = new int[2][2];
		tempos[0][0] = 0;
		tempos[0][1] = 10;
		
		assertEquals(0, banco.banco(1, 1, tempos));		
	}
	
	@Test
	public void CT2() {	
		tempos = new int[3][2];
		tempos[0][0] = 0;
		tempos[0][1] = 10;
		tempos[1][0] = 0;
		tempos[1][1] = 10;
		tempos[2][0] = 0;
		tempos[2][1] = 10;
		
		
		assertEquals(1, banco.banco(1, 3, tempos));		
	}
	
	@Test
	public void CTN() {	
		tempos = new int[7][2];
		tempos[0][0] = 0;
		tempos[0][1] = 7;
		tempos[1][0] = 0;
		tempos[1][1] = 7;
		tempos[2][0] = 0;
		tempos[2][1] = 7;
		tempos[3][0] = 0;
		tempos[3][1] = 7;
		tempos[4][0] = 0;
		tempos[4][1] = 7;
		tempos[5][0] = 0;
		tempos[5][1] = 7;
		tempos[6][0] = 0;
		tempos[6][1] = 7;
		
		assertEquals(1, banco.banco(2, 7, tempos));		
	}
	
	@Test
	public void CT3() {	
		tempos = new int[1000][2];
		
		for(int i = 0; i < 1000; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 10;
		}
		
		assertEquals(970, banco.banco(10, 1000, tempos));		
	}
	
	
	
}
