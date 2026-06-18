package aula_06_exerciciosQueueEDeque;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<String> booksDeque = new ArrayDeque<>();
		int escolha;
		System.out.println();
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("* 1 - Adicionar Livro a Pilha                    *");
		System.out.println("* 2 - Listar todos os Livros da Pilha            *");
		System.out.println("* 3 - Retirar Livro da Pilha                     *");
		System.out.println("* 0 - Sair                                       *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
		do {
			System.out.print("Entre a opção desejada: ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				sc.nextLine();
				System.out.println();
				System.out.print("Digite o nome do Livro: ");
				booksDeque.push(sc.nextLine());
				System.out.println();
				System.out.println("Livro adicionado!");
				System.out.println();
			} else if (escolha == 2) {
				if (booksDeque.isEmpty()) 
					System.out.println("\nA Pilha está vazia!");
				else {
					System.out.println("\nPilha: \n");
					for (var livro : booksDeque) 
						System.out.println(livro);
				}
				System.out.println();
			} else if (escolha == 3) {
				if (booksDeque.isEmpty()) 
					System.out.println("\nNão é possivel remover pois a Pilha está vazia!");
				else 
				System.out.println("\nLivro " + booksDeque.pop() + " removido!");
			
				System.out.println();
			} else if (escolha == 0){
				System.out.println("\nPrograma Finalizado!");
			} else {
				System.out.println("\nOpção invalida!");
			}
		} while (escolha != 0);		
		sc.close();
	}

}
