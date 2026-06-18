package aula_06_exerciciosQueueEDeque;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> queueCustomer = new LinkedList<>();
		int escolha;
		System.out.println();
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("* 1 - Adicionar Cliente na Fila                  *");
		System.out.println("* 2 - Listar todos os Clientes da fila           *");
		System.out.println("* 3 - Retirar Cliente da Fila                    *");
		System.out.println("* 0 - Sair                                       *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
		do {
			System.out.print("Entre a opção desejada: ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.println();
				System.out.print("Digite o nome do Cliente: ");
				queueCustomer.add(sc.next());
				System.out.println();
				System.out.println("Cliente adicionado!");
				System.out.println();
			} else if (escolha == 2) {
				if (queueCustomer.isEmpty()) 
					System.out.println("\nA Fila está vazia!");
				else {
					System.out.println("\nFila: \n");
					for (var cliente : queueCustomer) 
						System.out.println(cliente);
				}
				System.out.println();
			} else if (escolha == 3) {
				if (queueCustomer.isEmpty()) 
					System.out.println("\nNão é possivel remover pois a fila está vazia!");
				else 
				System.out.println("\nCliente " + queueCustomer.remove() + " removido!");
			
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
