package modulo7;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as
		 * características de um tipo de animal possível segundo o diagrama abaixo, que
		 * deve ser lido da esquerda para a direita.
		 */
		
		String subfilo, classe, habitoAlimentar;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Escreva o tipo de subfilo: ");
		subfilo = leia.nextLine();
		
		if(subfilo.equalsIgnoreCase("Vertebrado")) {
			System.out.print("Escreva a classe: ");
			classe = leia.nextLine();
			
			if(classe.equalsIgnoreCase("Ave")) {
				System.out.print("Escreva o hábito alimentar: ");
				habitoAlimentar = leia.nextLine();
				
				if(habitoAlimentar.equalsIgnoreCase("Carnívoro")) {
					System.out.print("Águia");
				}
				
				else if(habitoAlimentar.equalsIgnoreCase("Onívoro")) {
					System.out.print("Pomba");
				}
				
				else {
					System.out.print(":(");
				}
			}
			
			else if(classe.equalsIgnoreCase("Mamífero")) {
				System.out.print("Escreva o hábito alimentar: ");
				habitoAlimentar = leia.nextLine();
				
				if(habitoAlimentar.equalsIgnoreCase("Onívoro")) {
					System.out.print("Homem");
				}
				
				else if(habitoAlimentar.equalsIgnoreCase("Herbívoro")) {
					System.out.print("Vaca");
				}
				
				else {
					System.out.print(":(");
				}
			}
			
			else {
				System.out.print("Classe inválida!");
			}
		}
		
		else if(subfilo.equalsIgnoreCase("Invertebrado")) {
			System.out.print("Escreva a classe: ");
			classe = leia.nextLine();
			
			if(classe.equalsIgnoreCase("Inseto")) {
				System.out.print("Escreva o hábito alimentar: ");
				habitoAlimentar = leia.nextLine();
				
				if(habitoAlimentar.equalsIgnoreCase("Hematófago")) {
					System.out.print("Pulga");
				}
				
				else if(habitoAlimentar.equalsIgnoreCase("Herbívoro")) {
					System.out.print("Largata");
				}
				
				else {
					System.out.print(":(");
				}
			}
			
			else if(classe.equalsIgnoreCase("Anelídeo")) {
				System.out.print("Escreva o hábito alimentar: ");
				habitoAlimentar = leia.nextLine();
				
				if(habitoAlimentar.equalsIgnoreCase("Hematófago")) {
					System.out.print("Sanguessuga");
				}
				
				else if(habitoAlimentar.equalsIgnoreCase("Onívoro")) {
					System.out.print("Minhoca");
				}
				
				else {
					System.out.print(":(");
				}
			}
			
			else {
				System.out.print("Classe inválida!");
			}
			
		}
		
		else {
			System.out.print("Subfilo inválido!");
		}
		
		
	}

}
