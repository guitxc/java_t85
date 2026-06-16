package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdades = 0, fut = 0, bas = 0, volM18 = 0;
		double mediaIdades = 0.0d;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("**************************************************");
			System.out.println("* Pesquisa sobre Esportes Favoritos              *");
			System.out.println("**************************************************");
			System.out.println("* Digite sua idade:                              *");
			idade = sc.nextInt();
			do { 
				System.out.println("**************************************************");
				System.out.println("* Escolha seu esporte favorito                   *");
				System.out.println("* 1 - Futebol                                    *");
				System.out.println("* 2 - Voleiball                                  *");
				System.out.println("* 3 - Basqueteball                               *");
				System.out.println("* 4 - Outros                                     *");
				System.out.println("**************************************************");
				System.out.println("* Digite seu o numero equivalente:               *");
				esporte = sc.nextInt();
			} while (esporte < 1 || esporte > 4);
			// Estatisticas
			totalRespostas ++;
			
			somaIdades += idade;
			
			if (esporte == 1) {
				fut ++;
			} 
			if (idade >= 18 && esporte == 2) {
				volM18 ++;
			}
			
			do {
			System.out.println("**************************************************");
			System.out.println("* Deseja continuar? (S/N)                        *");
			continua = sc.next().toUpperCase().charAt(0);
			System.out.println("**************************************************");
			} while(continua != 'S' && continua != 'N');
			
			
		}
		
		mediaIdades = somaIdades / totalRespostas;
		System.out.printf("Média das idades: %.2f%n", mediaIdades);
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", fut);
		System.out.printf("Total de pessoas maiores de 18 anos que gostam de volei: %d%n", volM18);

		sc.close();
	}

}
