package modulo8;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares.
		
		
		int quantidade, numero, totalPares = 0, totalImpares = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de numeros: ");
		quantidade = leia.nextInt();
		
		if(quantidade>0) {
			for(int i = 1; i<=quantidade ;i++) {
				System.out.print("Digite o "+ i +"º número: ");
				numero = leia.nextInt();
				
				if(numero%2 == 0) {
					totalPares++;
				}
				
				else {
					totalImpares++;
				}
				
			}
			System.out.println("Total de números pares: " + totalPares);
			System.out.println("Total de números ímpares: " + totalImpares);
		}
		else {
			System.out.println("Quantidade inválida!");
		}
				
	}

}
