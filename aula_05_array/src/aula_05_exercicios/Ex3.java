package aula_05_exercicios;

public class Ex3 {

	public static void main(String[] args) {
		int mat[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}};
		int somaPrincipal = 0,somaSecundario = 0;
		

		System.out.println("Elementos da Diagonal Principal: ");
		for(int i=0;i<mat.length;i++) {
					System.out.print(mat[i][i]+ " ");
					somaPrincipal += mat[i][i];
				}
		
		System.out.println();
		System.out.println("Elementos da Diagonal Secundaria: ");
		for(int i=2;i>=0;i--) {
					System.out.print(mat[2-i][i]+ " ");
					somaSecundario += mat[2-i][i];
		}
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundario);
	}
}
