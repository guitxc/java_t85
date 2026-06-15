package aula_03_atividadePratica;

import java.util.Scanner;

public class Ex_02_classificacaoDeNotaDoAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome; float nota;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite sua nota final: ");
		nota = sc.nextFloat();
		
		System.out.println();
		System.out.println("Situação do aluno: " + nome);
		if (nota < 0 || nota > 10) {
			System.out.println("Nota invalida! Digite um valor de 0 a 10");
		} else if (nota == 10) {
			System.out.println("Nota maxima! Parabens!!!");
		} else if (nota >= 7) {
			System.out.println("Aprovado!");
		} else if (nota >= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
