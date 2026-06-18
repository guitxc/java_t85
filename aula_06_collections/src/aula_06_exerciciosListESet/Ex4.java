package aula_06_exerciciosListESet;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setInteger = new HashSet<>();
		
		// add
		Collections.addAll(setInteger, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		// search
		System.out.print("Digite o número que você deseja encontrar: ");
		int num = sc.nextInt();

		
		
		if (setInteger.contains(num))
			System.out.printf("O número %d foi encontrado!%n", num);
		else
            System.out.printf("O número %d não foi encontrado!%n", num);

		sc.close();
	}

}
