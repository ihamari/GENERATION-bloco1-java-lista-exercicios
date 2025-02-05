package modulo7;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.*/
		
		Scanner leia = new Scanner(System.in);
		int numero;
		String imparPar, positivoNegativo = "", resultado;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		// valida positivo negativo ou neutro
		if(numero>0){
			positivoNegativo = "positivo";
		}
		else if (numero<0) {
			positivoNegativo = "negativo";
		}
		else {
				positivoNegativo = "neutro";
		}
		
		// valida par ou impar
		if(numero%2 == 0) {
			imparPar = "par";
		}
		else {
			imparPar = "impar";
		}
		
		resultado = imparPar + " e " + positivoNegativo + "!";
		System.out.println("O Número é " + resultado);
		
		
	}

}
