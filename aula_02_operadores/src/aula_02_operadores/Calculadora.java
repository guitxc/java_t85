package aula_02_operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("--- CALCULADORA BÁSICA ---");
		
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
		System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
		System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
		System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
		System.out.printf("%.2f ^ %.2f = %.2f%n", num1, num2, Math.pow(num1, num2));
		System.out.printf("Raiz Quadrada  %.2f = %.2f%n", num1, Math.sqrt(num1));
		
		sc.close();
	}

}
