//OBI 2015 Fase 1 - Método mais eficaz
//Uma forma eficiente para encontrar a quantidade de divisores de um número

/**
* Essa forma acaba sendo eficiente pois, os testes só serão
* feitos enquanto o iterador for menor ou igual a raiz do 
* número inserido. 
*/
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

/*
* Na função solve(), os números são computados 2 vezes caso eles não sejam
* quadrados perfeitos em relação ao número inserido, e 1 vez caso sejam. 
* Isso ocorre pois em um número como o 60 por exempo, temos 2 como um de 
* seus divisores, e como sabemos 2*30 = 60, logo o 2 e o 30 já serão 
* computados nesse teste, tendo assim um ganho de eficiencia grande em 
* relação a algoritmos que testam até o iterador ser menor ou igual a inserção.
*/
