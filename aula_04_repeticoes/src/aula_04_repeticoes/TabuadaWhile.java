package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 1;
		
		System.out.print("Digite um o primeiro numero inteiro: ");
		num = sc.nextInt();
		
		
		
		while(cont <= 10) {
			System.out.printf("%d x %d = %d%n", num, cont, num*cont);
			cont ++;
		}
		
		sc.close();
	}

}
