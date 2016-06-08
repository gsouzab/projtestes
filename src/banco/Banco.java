package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Banco {
	
	public int banco(int c, int n, int[][] tempos){		
		
		if (n <= c){
			return 0;
		} else {
			int cont = 0;
			
			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);
			
			int caixas = c - 1;
			
			for (int i = 1; i < n; i++){				
				Collections.sort(termina);
				
				while (termina.get(0) <= tempos[i][0]){
					termina.remove(0);
					caixas = caixas + 1;
					
					if (termina.isEmpty()){
						break;
					}
				}
				
				if (caixas > 1){
					caixas = caixas - 1;
					termina.add(tempos[i][0]+tempos[i][1]);
				} else {
					Integer atendimento = Collections.min(termina);
					termina.remove(atendimento);
					
					termina.add(atendimento + tempos[i][1]);
					
					if (atendimento - tempos[i][0] > 20){
						cont = cont + 1;
					}
				}				
			}
			
			return cont;
		}			
	}
	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int c = scanner.nextInt();
//		int n = scanner.nextInt();
//		
//		int[][] tempos = new int[n][2];
//
//		for (int i = 0; i < n; i++){
//			tempos[i][0] = scanner.nextInt();
//			tempos[i][1] = scanner.nextInt();
//		}
//		
//		System.out.println(banco(c, n, tempos));
//		
//		scanner.close();		
//	}
}
