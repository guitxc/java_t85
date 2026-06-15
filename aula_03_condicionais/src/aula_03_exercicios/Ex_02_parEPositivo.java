package aula_03_exercicios;

import java.util.Scanner;

public class Ex_02_parEPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um número : ");
		num = sc.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.printf("Seu número %d é par & positivo", num);
		}
		else if (num % 2 != 0 && num > 0) {
			System.out.printf("Seu número %d é impar & positivo", num);
		}
		else if (num % 2 == 0 && num < 0) {
			System.out.printf("Seu número %d é par & negativo", num);
		}
		else if (num % 2 != 0 && num < 0) {
			System.out.printf("Seu número %d é impar & negativo", num);
		}
		else {
			System.out.println("O seu valor é nulo");
		}
		
		sc.close();
	}

}
