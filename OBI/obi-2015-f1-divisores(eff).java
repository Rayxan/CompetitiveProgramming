//OBI 2015 Fase 1 - Método mais eficaz
//Forma mais eficiente de achar a quantidade de divisores de um número
import java.util.Scanner;

public class solucao {
	
	public static int solve(int a) {
		int total = 0;
		
		for(int b = 1; b*b <= a; b++) {
			if(a%b == 0) {
				int c = a/b;
				
				if(c == b)
					total += 1;
				else
					total += 2;
			}
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		System.out.println(solve(x));
		
		input.close();
	}
}
