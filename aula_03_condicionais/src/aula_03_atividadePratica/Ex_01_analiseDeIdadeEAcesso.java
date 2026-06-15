package aula_03_atividadePratica;

import java.util.Scanner;

public class Ex_01_analiseDeIdadeEAcesso {

	public static void main(String[] args) {
		// Iniciar o Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variaveis
		int idade;
		String nome;
		
		// Entrada de dados
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println();
		
		// Verificação de idade
		if (idade >= 18) {
			System.out.println("Acesso liberado para: " + nome);
		} else {
			System.out.print("Possui autorização? (s/n): ");
			
			char autorizacao = sc.next().charAt(0);
			autorizacao = Character.toLowerCase(autorizacao);
			
			if (autorizacao == 's') {
				System.out.println("Acesso liberado para: " + nome);
			} else if (autorizacao == 'n') {
				System.out.println("Acesso negado para: " + nome + " - Não possui autorização");
			} else {
				System.out.println("Caractere inválido");
			}
		}
		
		
		
		// Fechar o Scanner
		sc.close();
	}

}
