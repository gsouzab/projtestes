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
		tempos = new int[4][2];
		tempos[0][0] = 0;
		tempos[0][1] = 10;
		tempos[1][0] = 0;
		tempos[1][1] = 10;
		tempos[2][0] = 1;
		tempos[2][1] = 10;
		tempos[3][0] = 1;
		tempos[3][1] = 10;
		
		assertEquals(1, banco.banco(1, 4, tempos));		
	}
	
	@Test
	public void CT3() {	
		tempos = new int[1000][2];
		
		for(int i = 0; i < 1000; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 5;
		};
			
		assertEquals(995, banco.banco(1, 1000, tempos));		
	}
	
	@Test
	public void CT4() {	
		tempos = new int[1][2];
		
		tempos[0][0] = 0;
		tempos[0][1] = 10;
		
		assertEquals(0, banco.banco(5, 1, tempos));		
	}
	
	@Test
	public void CT5() {	
		int N = 10;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 10;
		}
			
		assertEquals(1, banco.banco(3, N, tempos));		
	}
	
	@Test
	public void CT6() {	
		int N = 1000;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 5;
			tempos[i][1] = 5;
		}
		
		assertEquals(960, banco.banco(8, N, tempos));		
	}
	
	@Test
	public void CT7() {	
		int N = 1;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 300;
			tempos[i][1] = 10;
		}
		
		assertEquals(0, banco.banco(10, N, tempos));		
	}
	
	@Test
	public void CT8() {	
		int N = 20;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 5;
		}
		
		assertEquals(0, banco.banco(10, N, tempos));		
	}
	
	@Test
	public void CT9() {	
		int N = 1000;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = i % 300;
			tempos[i][1] = 1;
		}
		
		assertEquals(0, banco.banco(10, N, tempos));		
	}
	
	@Test
	public void CT10() {	
		int N = 31;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 10;
		}
		
		assertEquals(1, banco.banco(10, N, tempos));		
	}
	
	@Test
	public void CT11() {	
		int N = 100;
		tempos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			tempos[i][0] = 0;
			tempos[i][1] = 5;
		}
			
		assertEquals(95, banco.banco(1, N, tempos));		
	}
	
	@Test
	public void CT12() {	
		int N = 969;
		int M = 1000;
		int i;
		tempos = new int[M][2];
		
		for(i = 1; i < N; i++) {
			tempos[i][0] = i % 300;
			tempos[i][1] = 1;
		}
		
		for(i = N; i < M; i++) {
			tempos[i][0] = 300;
			tempos[i][1] = 10;
		}
		
		assertEquals(1, banco.banco(10, M, tempos));		
	}
	
}
