package aula_04_repeticoes;

import java.util.Scanner;

public class tabuadaDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 11;
		
		System.out.print("Digite um o primeiro numero inteiro: ");
		num = sc.nextInt();
		
		
		
		do{
			System.out.printf("%d x %d = %d%n", num, cont, num*cont);
			cont ++;
		} while (cont <= 10);
		
		sc.close();
	}

}
