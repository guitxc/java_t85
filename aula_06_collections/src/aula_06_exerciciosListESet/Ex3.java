package aula_06_exerciciosListESet;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setInteger = new HashSet<Integer>();
		
		System.out.println("Digite 10 valores inteiros: ");
		
		for (int i=0;i<10;i++) {
			setInteger.add(sc.nextInt());
		}
		
		System.out.println("Dados do set: ");
		for (var i : setInteger) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
