package modulo8;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa
		 */
		
		int total21 = 0, total50 = 0, idade = 0;
		Scanner leia = new Scanner(System.in);
		
		while(idade>=0) {
			System.out.print("Digite uma idade: ");			
			idade = leia.nextInt();
			if(idade<=21 && idade>0) {
				total21 ++;
			}
			else if (idade>=50) {
				total50 ++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + total21);
		System.out.println("Total de pessoas maiores de 50 anos: " + total50);
		
		

	}

}
