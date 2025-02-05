package modulo7;

import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de
		 * um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número
		 * inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
		 * que foi comprado.
		 */
		
		System.out.println("Código ---------- Produto ---------------- Preço Unitário");
		System.out.println("  1 ------------- Cachorro Quente ---------------R$ 10,00");
		System.out.println("  2 ------------- X-Salada ----------------------R$ 15,00");
		System.out.println("  3 ------------- X-Bacon -----------------------R$ 18,00");
		System.out.println("  4 ------------- Bauru -------------------------R$ 12,00");
		System.out.println("  5 ------------- Refrigerante--------------------R$ 8,00");
		System.out.println("  6 ------------- Suco de laranja ---------------R$ 13,00");
		
		
		int codigoProduto, quantidade;
		double precoUnitario = -1;
		String produto = null;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nCódigo do Produto: ");
		codigoProduto = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigoProduto) {
		case 1:
				produto = "Cachorro Quente";
				precoUnitario = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00;
		break;
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18.00;
		break;
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00;
		break;
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8.00;
		break;
		case 6:
			produto = "Suco de laranja";
			precoUnitario = 13.00;
		break;
		
		default:
			System.out.println("Digite um código válido! >:( ");
		
		}
		
		if(produto!= null && precoUnitario != -1 && quantidade >=0) {
			System.out.println("Produto: " + produto);
			System.out.println("Valor total: R$ " + precoUnitario*quantidade);
		}
		if (quantidade<0) {
			System.out.println("Desculpa, sem reembolsos");
		}

		

		

	}

}
