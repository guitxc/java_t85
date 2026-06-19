package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("--- CALCULADORA BÁSICA ---");
		
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, somar(num1, num2));
		System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, subtrair(num1, num2));
		System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, multiplicar(num1, num2));
		System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, dividir(num1, num2));
		
		sobre();
		
		sc.close();
	}

	public static double somar(double num3,double num4) {
		return num3 + num4;
	}
	
	public static double subtrair(double num1,double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1,double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1,double num2) {
		return num1 / num2;
	}
	
	public static void sobre() {
		System.out.println("Projeto Calculadora Básica");
		System.out.println("Desenvolvido por Guilherme S1!");
	}
}
