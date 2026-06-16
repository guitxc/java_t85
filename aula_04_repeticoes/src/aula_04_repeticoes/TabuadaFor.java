package aula_04_repeticoes;

import java.util.Iterator;
import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.printf("%d * %d = %d%n", num, i, num * i);
		}
		
		
		sc.close();
	}

}
