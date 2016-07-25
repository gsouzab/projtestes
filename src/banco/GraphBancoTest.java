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
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
