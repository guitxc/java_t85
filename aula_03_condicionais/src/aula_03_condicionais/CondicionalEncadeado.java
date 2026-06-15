package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalEncadeado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float media = 0;

		
		System.out.print("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a primeira nota: ");
		float nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6 && media <= 9) {
			System.out.println("Você esta na media! ");
		} else if (media <= 5) {
			System.out.println("Você esta de recuperação! ");
		} else if (media == 10) {
			System.out.println("Nota maxima, Parabens! ");
		} else {
			System.out.println("Media impossivel");
		}
		sc.close();
	}
}
