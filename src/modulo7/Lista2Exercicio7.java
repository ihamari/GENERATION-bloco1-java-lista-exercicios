package modulo7;

import java.util.Scanner;

public class Lista2Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma
		 * Calculadora simples. O programa deverá ler dois números float: numero1 e
		 * numero2, e na sequência ler o Código da operação matemática (número inteiro
		 * de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2
		 * números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem
		 * Operação Inválida!
		 */
		
		float num1, num2, resultado;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código------------Operação\n"
				+ "1-----------------Soma\r\n"
				+ "2 ----------------Subtração\r\n"
				+ "3 ----------------Multiplicação\r\n"
				+ "4 ----------------Divisão\r\n");
		
		System.out.print("Digite o 1º número: ");
		num1 = leia.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		num2 = leia.nextFloat();
		
		System.out.print("Operação: ");
		operacao = leia.nextInt();
		
		
		switch(operacao) {
			case 1:
				resultado = num1 + num2; 
				System.out.println(num1 + " + " + num2 + " = " + resultado);
			break;

			case 2:
				resultado = num1 - num2; 
				System.out.println(num1 + " - " + num2 + " = " + resultado);
			break;

			case 3:
				resultado = num1 * num2; 
				System.out.println(num1 + " * " + num2 + " = " + resultado);
			break;

			case 4:
				resultado = num1 / num2; 
				System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;
			default:
				System.out.println("Operação Inválida!");
		}
		
	}

}
