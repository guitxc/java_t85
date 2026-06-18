package aula_06_exerciciosListESet;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> colorsList = new ArrayList<>();
		
		System.out.println("Digite 5 cores: ");
		
		// add
		for(int i=0;i<5;i++) {
			colorsList.add(sc.next());
		}
		
		System.out.println();
		// get
		System.out.println("Listar todas as cores: ");
		
		for(var color : colorsList) {
			System.out.println(color);
		}
		System.out.println();
		
		// sort get
		System.out.println("Ordenar as cores: ");
		Collections.sort(colorsList);
		
		for(var color : colorsList) {
			System.out.println(color);
		}
		
		
		
		
		
		sc.close();
	}
}
