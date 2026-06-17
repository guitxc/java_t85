package aula_05_exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vect[] = {2,5,1,3,4,9,7,8,10,6};
		int num, posicao = -1;
		
		System.out.print("Digite o numero que você deseja encontrar: ");
		num = sc.nextInt();
		for(int i=0;i<vect.length;i++) {
			if (num == vect[i]) 
				posicao = i;
				break;
		}
		
		if (posicao != -1) {
			System.out.printf("O número %d está localizado na posição: %d", num, posicao);
		} else {
			System.out.printf("O número %d não foi encontrado!%n", num);
		}
		
		sc.close();
	}

}
