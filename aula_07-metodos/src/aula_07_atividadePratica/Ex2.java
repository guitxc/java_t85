package aula_07_atividadePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alunos = new ArrayList<>();
		
		System.out.println("+----------------------------------------+");
		System.out.println("|           SISTEMA ACADEMICO            |");
		System.out.println("+----------------------------------------+");
		System.out.println("  [1] Adicionar aluno");
		System.out.println("  [2] Listar todos os alunos");
		System.out.println("  [3] Ver a media geral das notas");
		System.out.println("  [0] Sair do sistema");
		System.out.println("+----------------------------------------+");
		
		int opcao = 0;
		do {
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 1) {
				System.out.println("\n+----------------------------------------+");
				System.out.println("|        CADASTRO DE NOVO ALUNO          |");
				System.out.println("+----------------------------------------+");
				System.out.print(" -> Nome: ");
				alunos.add(sc.nextLine());

				System.out.print(" -> Idade: ");
				alunos.add(sc.nextLine());

				System.out.print(" -> Nota Final: ");
				alunos.add(sc.nextLine());
				System.out.println("+----------------------------------------+\n");
				
			} else if (opcao == 2) {
				if (alunos.isEmpty()) {
					System.out.println("\n+----------------------------------------+");
					System.out.println("|     Nenhum aluno cadastrado ainda.     |");
					System.out.println("+----------------------------------------+\n");
				} else {
					System.out.println("\n=========================================");
					System.out.printf("%-15s | %-8s | %-6s\n", "NOME", "IDADE", "NOTA");
					System.out.println("=========================================");
					for (int i = 0; i < alunos.size(); i += 3) {
						System.out.printf("%-15s | %-8d | %-6.2f\n",
							alunos.get(i),
							Integer.parseInt(alunos.get(i + 1)),
							Float.parseFloat(alunos.get(i + 2))
						);
					}
					System.out.println("=========================================\n");
				}
				
			} else if (opcao == 3) {
				if (alunos.isEmpty()) {
					System.out.println("\n+----------------------------------------+");
					System.out.println("|     Nenhum aluno cadastrado ainda.     |");
					System.out.println("+----------------------------------------+\n");
				} else {
					float media = 0;
					for (int i = 2; i < alunos.size(); i += 3) {
						media += Float.parseFloat(alunos.get(i));
					}
					System.out.println("\n+----------------------------------------+");
					System.out.printf("  A media geral e: %.2f\n", media / (alunos.size() / 3));
					System.out.println("+----------------------------------------+\n");
				}
			}
		} while (opcao != 0);
		
		System.out.println("\n+----------------------------------------+");
		System.out.println("|   Sistema encerrado com sucesso.       |");
		System.out.println("+----------------------------------------+");
		sc.close();
	}
}
