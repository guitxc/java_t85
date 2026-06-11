package aula_01_variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;
		float num3, num4;
		String nome;
		char opcao = 'N';
		
		System.out.println("Variavel numero1 = " + num1);
		System.out.println("Variavel numero2 = " + num2);
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		
		System.out.print("Digite o primeiro valor Real: ");
		num3 = sc.nextFloat();
		System.out.print("Digite o segundo valor Real: ");
		num4 = sc.nextFloat();
		
		System.out.printf("%.0f * %.2f = %.2f%n", num3, num4, num3 * num4);

		System.out.print("Digite o seu nome: ");
		sc.skip("\\R?");
		nome = sc.nextLine();
		System.out.println("Nome: " + nome);
		
		sc.close();
	}

}
