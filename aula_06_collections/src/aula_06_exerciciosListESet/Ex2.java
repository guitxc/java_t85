package aula_06_exerciciosListESet;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		int num;
		
		// add
		Collections.addAll(list, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();

		int indice = list.indexOf(num);
		
		if(indice != -1)
			System.out.printf("O número %d está localizado na posição: %d%n", num, indice);
		else
            System.out.printf("O número %d não foi encontrado na lista!%n", num);
					
		
		
		
		sc.close();
	}

}
