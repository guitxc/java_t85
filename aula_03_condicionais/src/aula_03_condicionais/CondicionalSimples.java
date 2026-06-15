package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Inicio do programa!---");

		
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		if (num > 10 && num < 100) {
			System.out.println("- O numero digitado é maior que 10!  -");
			System.out.println("-                   E                -");
			System.out.println("- O numero digitado é menor que 100! -");
		}
		System.out.println();
		System.out.println("---Fim do programa!---");
		sc.close();
	}
}
