package aula_03_condicionais;

public class CondicionalVF {

	public static void main(String[] args) {
		int idade = 17;
		
		if (idade >= 18) 
			System.out.println("O participante é maior de idade!");
		else if (idade >=16) 
			System.out.println("O participante ja pode votar, mas não é obrigado!");
		else 
			System.out.println("O participante é menor de idade!");
	}

}
