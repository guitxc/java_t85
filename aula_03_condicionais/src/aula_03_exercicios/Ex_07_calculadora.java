package aula_03_exercicios;

import java.util.Scanner;

public class Ex_07_calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1, num2;
		int ope;
		
		System.out.println("**************************************************");
		System.out.println("*                   Calculadora                  *");
		System.out.println("**************************************************");
		System.out.println("* 1 - Soma                                       *");
		System.out.println("* 2 - Subtração                                  *");
		System.out.println("* 3 - Multiplicação                              *");
		System.out.println("* 4 - Divisão                                    *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.print("Digite o 1° numero: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o 2° numero: ");
		num2 = sc.nextFloat();
		System.out.print("Operação: ");
		ope = sc.nextInt();
		
		switch(ope) {
		case 1:
			System.out.printf("%.1f + %.1f = %.1f%n", num1, num2, (num1+num2));
			break;
		case 2:
			System.out.printf("%.1f - %.1f = %.1f%n", num1, num2, (num1-num2));
			break;
		case 3:
			System.out.printf("%.1f * %.1f = %.1f%n", num1, num2, (num1*num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.printf("%.1f / %.1f = %.1f%n", num1, num2, (num1/num2));
			}
			else {
				System.out.println("Divisão por zero, resultado invalido!");
			}
			break;
		default:
			System.out.println("Operação invalida");
		}
		
		
		
		
		sc.close();
	}

}
