package aula_04_exercicios;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = sc.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num2 = sc.nextInt();
		
		System.out.println();
		
		if (num1 > num2) {
			System.out.println("Intervalo inválido!");
		} else {
			for(int i=num1;i<=num2;i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é multiplo de 3 e 5.%n", i);
				}
			}
		}
		sc.close();
	}
}
