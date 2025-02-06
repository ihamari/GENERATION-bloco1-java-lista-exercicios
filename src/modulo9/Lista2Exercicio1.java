package modulo9;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela: Todos os elementos da Diagonal Principal Todos os elementos da Diagonal Secundária A Soma de todos os elementos da Diagonal Principal A Soma de todos os elementos da Diagonal Secundária
		 */
		
		//Scanner leia = new Scanner(System.in);
		//int matriz[][] = new int [3][3];
		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		int arrayDiagonalPrincipal[] = new int[3];
		int arrayDiagonalSecundaria[] = new int[3];
		
		//0|0  1|1  2|2		Diagonal Principal
		//0|2  1|1  2|0		Diagonal Secundaria
		
		System.out.println("Elementos da Diagonal Principal:");
		for(int linha = 0; linha<3; linha++) { // monta o array da Diagonal Principal e faz a soma delas
			for(int coluna = 0; coluna<3; coluna++) {
				if(linha==coluna) {
					arrayDiagonalPrincipal[linha] = matriz[linha][coluna];
					somaDiagonalPrincipal += matriz[linha][coluna];
					System.out.print(matriz[linha][coluna] + " ");
				}
			}
		}
		
		 System.out.println("\n\nElementos da Diagonal Secundária:");
		for(int linha = 0; linha<3; linha++) { // monta o array da Diagonal Secundária e faz a soma delas
			int coluna = 2 - linha;
			arrayDiagonalSecundaria[linha] = matriz[linha][coluna];	
			somaDiagonalSecundaria += matriz[linha][coluna];
			System.out.print(matriz[linha][coluna] + " ");
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:\n" + somaDiagonalPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária:\n" + somaDiagonalSecundaria);
		

	}

}
