package aula_05_exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vect[] = new int[10];
		int soma = 0;
		double media = 0.0d;
		
		// adicionando valores no vetor
		for(int i=0;i<vect.length;i++) {
			System.out.printf("Digite o %d° valor: ",i+1);
			vect[i] = sc.nextInt();
			soma += vect[i];
		}
		// impar
		System.out.println("Elementos nos indices impares: ");
		for(int i=1;i<vect.length;i+=2) 
			System.out.print(vect[i] + " ");
		
		System.out.println();
		System.out.println();
		// par
		System.out.println("Elementos nos indices pares: ");
		for(int i=0;i<vect.length;i++)
			if (vect[i] % 2 == 0)
				System.out.print(vect[i] + " ");
		
		System.out.println();
		System.out.println();
		// soma
		System.out.println("Soma: "+ soma);

		System.out.println();
		// media
		media = (double)soma / vect.length;
		System.out.printf("Média: %.2f", media);
		

		sc.close();
	}

}
