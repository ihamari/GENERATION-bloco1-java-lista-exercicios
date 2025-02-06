package modulo8;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5
		 */
		
		int abertoFechado, primeiroNumero, ultimoNumero, totalMultiplos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Deseja considerar um intervalo aberto ou fechado?"
				+ "\n 1 - Para intervalo aberto (inclui o primeiro e o último número)"
				+ "\n 2 - Para intervalo fechado (considera apenas os números entre eles, sem incluir os limites)"
				+ "\nDigite o tipo de intervalo: ");
		
		abertoFechado = leia.nextInt();
		
		switch(abertoFechado) {
			case 1:
				System.out.print("Digite o primeiro número do intervalo: ");
				primeiroNumero = leia.nextInt();
				
				System.out.print("Digite o último número do intervalo: ");
				ultimoNumero = leia.nextInt();
				
				if(primeiroNumero>ultimoNumero) {
					System.out.println("Intervalo inválido!");
				}
				else {
					for(int i = primeiroNumero; i<= ultimoNumero; i++) {
						if( i%3 == 0 && i%5 == 0 ){
							System.out.println(i + " é múltiplo de 3 e 5");
							totalMultiplos++;
						}
					}
					if(totalMultiplos == 0) {
						System.out.println("Não existe multiplos de 3 e 5!");
					}
				}
				
				
				break;
			case 2:
				System.out.print("Digite o primeiro número do intervalo: ");
				primeiroNumero = leia.nextInt();
				
				System.out.print("Digite o último número do intervalo: ");
				ultimoNumero = leia.nextInt();
				
				if(primeiroNumero>ultimoNumero) {
					System.out.println("Intervalo inválido!");
				}
				else {
					for(int i = primeiroNumero+1; i<ultimoNumero; i++) {
						if( i%3 == 0 && i%5 == 0 ){
							System.out.println(i + " é múltiplo de 3 e 5");
							totalMultiplos++;
						}
					}
					if(totalMultiplos == 0) {
						System.out.println("Não existe multiplos de 3 e 5!");
					}
				}
				break;
				
			default:
				System.out.println("Opção de intervalo inválida!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
