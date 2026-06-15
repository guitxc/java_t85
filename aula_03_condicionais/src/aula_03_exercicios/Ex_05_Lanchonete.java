package aula_03_exercicios;

import java.util.Scanner;

public class Ex_05_Lanchonete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("**************************************************");
		System.out.println("*                  Lanchonete                    *");
		System.out.println("**************************************************");
		System.out.println("* 1 - Cachorro Quente - R$10,00                  *");
		System.out.println("* 2 - X-Salada - R$15,00                         *");
		System.out.println("* 3 - X-Bacon - R$18,00                          *");
		System.out.println("* 4 - Bauru - R$12,00                            *");
		System.out.println("* 5 - Refrigerante - R$8,00                      *");
		System.out.println("* 6 - Suco de laranja - R$13,00                  *");
		System.out.println("**************************************************");

		System.out.println();
		System.out.print("Digite o Codigo do Produto: ");
		int cod = sc.nextInt();
		System.out.print("Digite a Quantidade do Produto: ");
		int qtd = sc.nextInt();
		System.out.println();
		
		switch(cod) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$%.2f%n", qtd * 10.00);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$%.2f%n", qtd * 15.00);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total: R$%.2f%n", qtd * 18.00);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$%.2f%n", qtd * 12.00);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$%.2f%n", qtd * 8.00);
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Valor total: R$%.2f%n", qtd * 13.00);
			break;
		default:
			System.out.println("Codigo invalido");
		}
		
		sc.close();
	}

}
