package aula_02_exercicios;

import java.util.Scanner;

public class Exer_02_Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println(" --- Digite as notas --- ");
		System.out.print("Primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.print("Segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.print("Terceira nota: ");
		nota3 = sc.nextFloat();
		System.out.print("Quarta nota: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A sua media é: %.2f%n", media);
	}
}
