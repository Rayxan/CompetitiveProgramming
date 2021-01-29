//OBI 2015 Fase 1 - Método não tão eficaz
import java.util.Scanner;

public class solucao {
	public static int solve(int x) {
		int cont = 0;
		
		for(int i=1; i<=x;i++) {
			if(x%i == 0)
				cont++;
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		System.out.println(solve(x));
		input.close();
	}
}
