package modulo7;

import java.util.Scanner;

public class Lista2Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.


Código do Cargo ------------Cargo -------------Percentual do Reajuste
1 -------------------------Gerente ----------------------10%
2 -------------------------Vendedor----------------------7%
3 -------------------------Supervisor--------------------9%
4 -------------------------Motorista --------------------6%
5 -------------------------Estoquista--------------------5%
6 -------------------------Técnico de TI ----------------8%

		 */
		
		Scanner leia = new Scanner(System.in);
		
		String nome = null, cargo = null;
		int codigoCargo;
		float salario, percentualReajuste = 0f;
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Código do Cargo ");
		codigoCargo = leia.nextInt();
		
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		
		switch(codigoCargo) {
			case 1:
				cargo = "Gerente";
				percentualReajuste = 1.10f;
			break;
			case 2:
				cargo = "Vendedor";
				percentualReajuste = 1.07f;
			break;
			case 3:
				cargo = "Supervisor";
				percentualReajuste = 1.09f;
			break;
			case 4:
				cargo = "Motorista";
				percentualReajuste = 1.06f;
			break;
			case 5:
				cargo = "Estoquista";
				percentualReajuste = 1.05f;
			break;
			case 6:
				cargo = "Técnico de TI";
				percentualReajuste = 1.08f;
			break;
			default:
				System.out.println("Digite um código válido! >:( ");

		}
		if(nome != null && cargo != null && salario >=0) {
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: R$" + salario*percentualReajuste);	
		}
		
		
		
		
		
	}

}
