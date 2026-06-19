package aula_07_atividadePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = lerNumeros(sc);
		
		System.out.println(somar(numbers));
		
		System.out.println(media(somar(numbers), numbers.size()));

		System.out.println(max(numbers));

		
		sc.close();
	}
	// Entrada de dados
	public static ArrayList<Integer> lerNumeros(Scanner sc) {
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i = 0; i < 5; i++) {
	        list.add(sc.nextInt());
	    }
	    return list;
	}
	// Soma
	public static int somar(ArrayList<Integer> list) {
		int soma = 0;
		for(int i : list) {
			soma += i;
		}
		return soma;
	}
	// Maior numero
	public static int max(ArrayList<Integer> list) {
		int max = list.get(0);
		for(int i : list) {
			if (i > max) {
				max = i;
				}
			}
		return max;
	}
	// Media
	public static float media(int soma, int size) {
		return (float)soma / size;
	}
}

