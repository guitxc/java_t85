package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {			
				System.out.println("Digite o Dividendo: ");
				dividendo = sc.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = sc.nextInt();
										
				divide(dividendo, divisor);
				
				loop = false;

				
			} catch (InputMismatchException e) {
				System.err.println("Erro de digitação: "+ e.getMessage());
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.err.println("Erro de calculo: "+ e.getMessage());
				sc.nextLine();
			} finally {
				System.out.println("Obrigado!");
			}
			
		} while (loop);
		
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
