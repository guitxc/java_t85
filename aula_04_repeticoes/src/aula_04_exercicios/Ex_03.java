package aula_04_exercicios;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade>=0) {
			System.out.print("Digite uma idade: "); 
			idade = sc.nextInt();
			
			if (idade < 21) {
				menor21 ++;
			}
			if (idade > 50) {
				maior50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+ menor21);
		System.out.println("Total de pessoas maiores de 50 anos: "+ maior50);

		sc.close();
	}
}
