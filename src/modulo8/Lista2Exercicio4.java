package modulo8;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, categoria, totalBackEnd = 0, totalMulheresFront = 0, totalHomensMobile40 = 0, naoBinariosFullStack30 = 0; 
				
		double totalRespostas = 0, totalIdade = 0 ;
		String continuar = "S";
		
		while(continuar.equalsIgnoreCase("S")) {
			System.out.print("Idade: ");
			idade = leia.nextInt();
			
			System.out.print("Identidade de Gênero: ");
			genero = leia.nextInt();
			
			System.out.print("Pessoa Desenvolvedora: ");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				totalBackEnd++;
			}
			else if((genero == 1 || genero ==4) && categoria == 2) {
				totalMulheresFront++;
			}
			else if((genero == 2 || genero ==5) && categoria == 3 && idade>=40) {
				totalHomensMobile40++;
			}
			else if(genero == 3 && categoria == 4 && idade>=30) {
				naoBinariosFullStack30++;
			}
			
			totalRespostas++;
			totalIdade+=idade;
			
			System.out.print("Deseja continuar (S/N)? ");
			leia.nextLine(); // "limpa"
			continuar = leia.nextLine();
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackEnd);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobile40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+ naoBinariosFullStack30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalRespostas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + totalIdade/totalRespostas);
	
		
	}

}
