package modulo8;

import java.util.Scanner;

public class Lista3Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:*/
		
		
		int numero, total = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero>0) {
				total += numero;
			}
		}while(numero!=0);
		
		System.out.print("A soma dos números positivos é: " + total);
		
	}

}
