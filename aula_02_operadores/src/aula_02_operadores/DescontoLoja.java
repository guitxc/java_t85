package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00d;
		
		System.out.print("Digite o valor total da compra R$ : ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("O Clinte é Prime? ");
		boolean isPrime = sc.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		System.out.println("--- Status do Pedido ---");
		System.out.printf("Valor da Compra: R$ %.2f%n", valorCompra);
		System.out.printf("Cliente Prime? %b%n", isPrime);
		System.out.printf("Frete Gratis? %b%n", ganhouFrete);
		
		sc.close();
	}

}
