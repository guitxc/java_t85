package aula_03_exercicios;

import java.util.Scanner;

public class Ex_02_parEPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um número : ");
		num = sc.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.printf("Seu número %d é par e positivo!", num);
		}
		else if (num % 2 != 0 && num > 0) {
			System.out.printf("Seu número %d é impar e positivo!", num);
		}
		else if (num % 2 == 0 && num < 0) {
			System.out.printf("Seu número %d é par e negativo!", num);
		}
		else if (num % 2 != 0 && num < 0) {
			System.out.printf("Seu número %d é impar e negativo!", num);
		}
		else {
			System.out.println("O seu valor é nulo");
		}
		
		sc.close();
	}

}
