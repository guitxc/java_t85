package aula_04_exercicios;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, cont = 0;
		float media = 0;
		
		do {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			if (num % 3 == 0 && num != 0) {
				media += num;
				cont ++;
			}
		} while (num != 0);
		
		if (cont > 0) {
			media = media / cont;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f%n", media);
		} 
		else {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		}
		sc.close();
	}

}
