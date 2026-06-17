package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Vetor inicializado com dados
		int vetorInteiros[] = {10, 20, 70, 45, 78, 100, 70, 56, 666};
		
		// Vetor vazio
		float vetorReal[] = new float[5];
		
		// Listar todos os dados do vetor
		for(int i=0;i<vetorInteiros.length;i++) {
			System.out.printf("VetorInteiros[%d] = %d%n", i,  vetorInteiros[i]);
		}
		// Inserir dados no vetor de reais
		for(int i=0;i<vetorReal.length;i++) {
			System.out.printf("Digite um valor real para a posição [%d]:%n ", i);
			vetorReal[i] = sc.nextFloat();
		}
		System.out.println();
		
		// Ordena o vetor em ordem crescente
		Arrays.sort(vetorReal);
		
		// Ordena de forma decresente
		
		for(int i=vetorReal.length - 1;i>= 0;i--) {
			System.out.printf("VetorInteiros[%d] = %.2f%n", i,  vetorReal[i]);
		}
		System.out.println();
		
		// Listar todos os valores do vetor de reais
		for(int i=0;i<vetorReal.length;i++) {
			System.out.printf("VetorInteiros[%d] = %.2f%n", i,  vetorReal[i]);
		}
		System.out.println();
		// ForEach
		String[] frutas = {"Maçã", "Banana", "Morango"};

		// "Para cada fruta (String) dentro do vetor frutas"
		for (String fruta : frutas) {
		    System.out.println(fruta);
		}
		
		System.out.println(vetorReal.length);
		
		System.out.println("Qual é o indice do valor 10 no vetor de reais? "+ Arrays.binarySearch(vetorReal, 10));
		
		sc.close();
	}
}
