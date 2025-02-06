package modulo7;

import java.util.Scanner;

public class Lista2Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá
		 * ler o tipo de operação a ser realizada com base na tabela abaixo (número
		 * inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções
		 * 2 e 3). Considere que um saque só pode ser realizado caso haja saldo
		 * suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável
		 * saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação
		 * seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
		 */
		
		int operacao;
		float valor, saldo = 1000.00f;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código------------Operação\n"
				+ "1-----------------Saldo\r\n"
				+ "2 ----------------Saque\r\n"
				+ "3 ----------------Depósito\r\n");
		
		System.out.print("Digite a Operação: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.print("Operação - Saldo\n"
					+ "Saldo:  R$" + saldo);
			break;
		case 2:
			System.out.print("Valor do Saque: ");
			valor = leia.nextFloat();
			
			if(saldo>=valor) {
				saldo -=valor;
				System.out.print("Operação - Saque\n"
						+ "Novo Saldo:  R$" + saldo);
			}
			else {
				System.out.print("Saldo Insuficiente!");
			}
			
			break;
		case 3:
			System.out.print("Valor do Depósito: ");
			valor = leia.nextFloat();
			
			saldo +=valor;
			System.out.print("Operação - Depósito\n"
					+ "Novo Saldo:  R$" + saldo);
			
			break;
		default:
			System.out.println("Operação Inválida!");
		
		}
	}

}
