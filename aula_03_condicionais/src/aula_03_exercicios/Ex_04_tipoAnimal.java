package aula_03_exercicios;

import java.util.Scanner;

public class Ex_04_tipoAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String umOuOutro;
		
		System.out.print("Seu animal é Vertebrado ou Invertebrado? ");
		umOuOutro = sc.next();
		if ("Vertebrado".equalsIgnoreCase(umOuOutro)) {
			System.out.print("Seu animal é Ave ou Mamífero? ");
			umOuOutro = sc.next();
			if ("Ave".equalsIgnoreCase(umOuOutro)) {
				System.out.print("Seu animal é Carnívoro ou Onívoro? ");
				umOuOutro = sc.next();
				if ("carnivoro".equalsIgnoreCase(umOuOutro) || "carnívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Águia");
				else if ("carnivoro".equalsIgnoreCase(umOuOutro) || "carnívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Pomba");
				else 
					System.out.println("Invalido");
			}
			else if ("Mamifero".equalsIgnoreCase(umOuOutro) || "Mamífero".equalsIgnoreCase(umOuOutro)) {
				System.out.print("Seu animal é Onívoro ou Herbívoro? ");
				umOuOutro = sc.next();
				if ("onivoro".equalsIgnoreCase(umOuOutro) || "onívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Homem");
				else if ("herbivoro".equalsIgnoreCase(umOuOutro) || "herbívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Vaca");
				else 
					System.out.println("Invalido");
			}
		}
		else if ("invertebrado".equalsIgnoreCase(umOuOutro)) {
			System.out.print("Seu animal é Inseto ou Anelídeo? ");
			umOuOutro = sc.next();
			if ("Inseto".equalsIgnoreCase(umOuOutro)) {
				System.out.print("Seu animal é Hematófago ou Herbívoro? ");
				umOuOutro = sc.next();
				if ("hematofago".equalsIgnoreCase(umOuOutro) || "hematófago".equalsIgnoreCase(umOuOutro))
					System.out.println("Pulga");
				else if ("herbivoro".equalsIgnoreCase(umOuOutro) || "herbívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Lagarta");
				else 
					System.out.println("Invalido");
			}
			else if ("anelideo".equalsIgnoreCase(umOuOutro) || "anelídeo".equalsIgnoreCase(umOuOutro)) {
				System.out.print("Seu animal é Hematófago ou Onívoro? ");
				umOuOutro = sc.next();
				if ("hematofago".equalsIgnoreCase(umOuOutro) || "hematófago".equalsIgnoreCase(umOuOutro))
					System.out.println("Sanguessuga");
				else if ("onivoro".equalsIgnoreCase(umOuOutro) || "onívoro".equalsIgnoreCase(umOuOutro))
					System.out.println("Minhoca");
				else 
					System.out.println("Invalido");
			} else 
				System.out.println("Invalido");
		} else
			System.out.println("Invalido");
		
		sc.close();
	}
}
