package aula_07_atividadePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList<>();
		
		System.out.println("+----------------------------------------+");
		System.out.println("|           CONTROLE DE ESTOQUE          |");
		System.out.println("+----------------------------------------+");
		System.out.println("  1 - Adicionar produto");
		System.out.println("  2 - Atualizar quantidade");
		System.out.println("  3 - Listar produtos");
		System.out.println("  0 - Sair do sistema");
		System.out.println("+----------------------------------------+");
		
		int opcao = 0;
		do {
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 1) {
				System.out.println("\n+----------------------------------------+");
				System.out.println("|        CADASTRO DE NOVO PRODUTO        |");
				System.out.println("+----------------------------------------+");
				System.out.print(" -> Nome do produto: ");
				String nome = sc.nextLine();
				
				int encontrado = -1;
				for (int i = 0; i < estoque.size(); i += 2) {
					if (estoque.get(i).equalsIgnoreCase(nome)) {
						encontrado = i;
						break;
					}
				}
				
				if (encontrado != -1) {
					System.out.println("  Erro: Este produto ja esta cadastrado.");
				} else {
					System.out.print(" -> Quantidade em estoque: ");
					String qtd = sc.nextLine();
					estoque.add(nome);
					estoque.add(qtd);
					System.out.println("  Produto cadastrado com sucesso.");
				}
				System.out.println("+----------------------------------------+\n");
				
			} else if (opcao == 2) {
				System.out.println("\n+----------------------------------------+");
				System.out.println("|         ATUALIZAR QUANTIDADE           |");
				System.out.println("+----------------------------------------+");
				if (estoque.isEmpty()) {
					System.out.println("  Nenhum produto cadastrado ainda.");
				} else {
					System.out.print(" -> Nome do produto: ");
					String nome = sc.nextLine();
					
					int encontrado = -1;
					for (int i = 0; i < estoque.size(); i += 2) {
						if (estoque.get(i).equalsIgnoreCase(nome)) {
							encontrado = i;
							break;
						}
					}
					
					if (encontrado != -1) {
						System.out.print(" -> Digite a nova quantidade: ");
						String novaQtd = sc.nextLine();
						estoque.set(encontrado + 1, novaQtd);
						System.out.println("  Quantidade atualizada com sucesso.");
					} else {
						System.out.println("  Produto nao encontrado no estoque.");
					}
				}
				System.out.println("+----------------------------------------+\n");
				
			} else if (opcao == 3) {
				System.out.println("\n+----------------------------------------+");
				System.out.println("|           PRODUTOS EM ESTOQUE          |");
				System.out.println("+----------------------------------------+");
				if (estoque.isEmpty()) {
					System.out.println("  Nenhum produto cadastrado ainda.");
				} else {
					for (int i = 0; i < estoque.size(); i += 2) {
						System.out.println("  Produto: " + estoque.get(i) + " | Quantidade: " + estoque.get(i + 1));
					}
				}
				System.out.println("+----------------------------------------+\n");
			}
		} while (opcao != 0);
		
		System.out.println("\n+----------------------------------------+");
		System.out.println("|   Sistema encerrado com sucesso.       |");
		System.out.println("+----------------------------------------+");
		sc.close();
	}
}
