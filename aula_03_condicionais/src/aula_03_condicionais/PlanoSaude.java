package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		/**
		 */
		
		System.out.printf("Nome: %s%n", nome);
		
		if (idade >= 0 && idade <= 10) {
			System.out.println("A Mensalidade do plano é R$100,00");
		}
		else if (idade > 10 && idade <= 29) {
			System.out.println("A Mensalidade do plano é R$200,00");
		}
		else if (idade > 29 && idade <= 45) {
			System.out.println("A Mensalidade do plano é R$300,00");
		}
		else if (idade > 45 && idade <= 59) {
			System.out.println("A Mensalidade do plano é R$500,00");
		}
		else if (idade > 59 && idade <= 65) {
			System.out.println("A Mensalidade do plano é R$600,00");
		}
		else {
			System.out.println("A Mensalidade do plano é R$1000,00");
		}
		
		sc.close();
	}

}
