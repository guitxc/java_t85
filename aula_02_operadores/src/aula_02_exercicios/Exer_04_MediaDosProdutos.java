package aula_02_exercicios;

import java.util.Scanner;

public class Exer_04_MediaDosProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		System.out.print("Digite o primeiro produto: ");
		n1 = sc.nextFloat();
		System.out.print("Digite o segundo produto: ");
		n2 = sc.nextFloat();
		System.out.print("Digite o terceiro produto: ");
		n3 = sc.nextFloat();
		System.out.print("Digite o quarto produto: ");
		n4 = sc.nextFloat();
		
		media = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferenca entre os produtos: %.1f", media);
		
		sc.close();
	}

}
