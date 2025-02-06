package modulo9;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
//			Todos os elementos dos índices ímpares do vetor 
//			Todos os elementos do vetor que são números pares
//			A Soma de todos os elementos do vetor
//			A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

		Scanner leia = new Scanner(System.in);
		int numero, qtd = 0;
		float soma = 0f, media;
		int array[] = new int[10];
		
		for(int i = 0; i<10 ; i++) {
			System.out.print("Digite o numero da posição " + i + " : ");
			numero = leia.nextInt();
			array[i] = numero;
			soma += numero;
			qtd++;
		}
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int i=0; i<10; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println("\nElementos nos índices pares: ");
		
		for(int i=0; i<10; i++) {
			if(array[i]%2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		media = soma/qtd;
		
		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f", media);
		
		
	}

}
