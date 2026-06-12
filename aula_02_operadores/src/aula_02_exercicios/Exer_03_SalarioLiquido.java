package aula_02_exercicios;

import java.util.Scanner;

public class Exer_03_SalarioLiquido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adicionaNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Digite o seu salario bruto: ");
		salarioBruto = sc.nextFloat();
		System.out.print("Digite adicional noturno: ");
		adicionaNoturno = sc.nextFloat();
		System.out.print("Digite horas extras: ");
		horasExtras = sc.nextFloat();
		System.out.print("Digite os descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionaNoturno + horasExtras + descontos;
		System.out.printf("Seu salario liquido é : %.2f", salarioLiquido);
		
		sc.close();
	}
}
