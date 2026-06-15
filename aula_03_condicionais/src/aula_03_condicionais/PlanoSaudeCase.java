package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("***************************************************");
		System.out.println("                        Faixa etaria               ");
		System.out.println("***************************************************");
		System.out.println("        1 - De 0 a 10 anos de idade                ");
		System.out.println("        2 - De 11 a 29 anos de idade               ");
		System.out.println("        3 - De 30 a 10 anos de idade               ");
		System.out.println("        4 - De 46 a 10 anos de idade               ");
		System.out.println("        5 - De 60 a 65 anos de idade               ");
		System.out.println("        6 - Maiores de 65 anos de idade            ");
		System.out.println("***************************************************");





		System.out.println("Escolha a sua faixa etaria: ");
		faixaEtaria = sc.nextInt();
		
		System.out.printf("Nome: %s%n", nome);

		
		switch(faixaEtaria) {
			case 1:
				System.out.println("A Mensalidade do plano é R$100,00");
			break;
			case 2:
				System.out.println("A Mensalidade do plano é R$200,00");
			break;
			case 3:
				System.out.println("A Mensalidade do plano é R$300,00");
			break;
			case 4:
				System.out.println("A Mensalidade do plano é R$500,00");
			break;
			case 5:
				System.out.println("A Mensalidade do plano é R$600,00");
			break;
			case 6:
				System.out.println("A Mensalidade do plano é R$1000,00");
			break;
			default:
				System.out.println("Opção invalida");
		}
		
		sc.close();
	}

}
