package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	
	public int banco(int c, int n, int[][] tempos){	
		System.out.println("1");
		
		if (n <= c){
			System.out.println("2");
			return 0;
		} else {
			int cont = 0;
			
			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);
			
			int caixas = c - 1;
			System.out.println("3");
			
			for (int i = 1; i < n; i++){
				System.out.println("4");
				Collections.sort(termina);
				System.out.println("6");
				
				System.out.println("7");
				while (termina.get(0) <= tempos[i][0]){
					if(i > 0) System.out.println("7");
					System.out.println("9");
					termina.remove(0);
					caixas = caixas + 1;
					
					if (termina.isEmpty()){
						break;
					}
				}
				
				System.out.println("8");
				if (caixas > 1){
					System.out.println("11");
					caixas = caixas - 1;
					termina.add(tempos[i][0]+tempos[i][1]);
				} else {
					System.out.println("10");
					Integer atendimento = Collections.min(termina);
					termina.remove(atendimento);
					
					termina.add(atendimento + tempos[i][1]);
					
					if (atendimento - tempos[i][0] > 20){
						System.out.println("12");
						cont = cont + 1;
					}
				}	
				System.out.println("13");
			}
			System.out.println("4");
			System.out.println("5");
			return cont;
		}			
	}
	
//	public static void main(String[] args) {
//		
//		
//		int[][] tempos;
//
//		tempos = new int[5][2];
//		
//		tempos[0][0] = 0;
//		tempos[0][1] = 10;
//		tempos[1][0] = 0;
//		tempos[1][1] = 10;
//		tempos[2][0] = 1;
//		tempos[2][1] = 10;
//		tempos[3][0] = 2;
//		tempos[3][1] = 10;
//		tempos[4][0] = 30;
//		tempos[4][1] = 10;
//		
//		System.out.println(banco(2, 5, tempos));
//		
//	}
}
