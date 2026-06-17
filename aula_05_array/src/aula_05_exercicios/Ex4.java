package aula_05_exercicios;

public class Ex4 {

	public static void main(String[] args) {
		double notas[][] = {
			{4.0, 5.0, 7.0, 3.0},
			{2.5, 6.5, 4.7, 8.0},
			{10.0, 8.5, 9.5, 8.0},
			{9.0, 6.5, 7.6, 8.2},
			{5.0, 5.0, 5.0, 6.3},
			{7.0, 8.0, 9.0, 8.5},
			{5.5, 3.5, 2.5, 1.0},
			{8.0, 9.0, 10.0, 9.5},
			{5.6, 5.8, 6.5, 7.0},
			{7.5, 8.5, 9.5, 10.0}};
		
		double media[] = new double[notas.length];
		
		for (int i = 0; i < notas.length; i++) {
		    media[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / notas[i].length;
		}
		System.out.println("Vetor: ");
		
		for(int i=0;i < notas.length;i++)
			System.out.printf("%.1f ",media[i]);
	}
}
