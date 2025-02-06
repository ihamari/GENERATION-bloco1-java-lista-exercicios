package modulo9;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela.
		 */

		int numeros[] = {2,2,1,3,4,9,7,8,10,6};
		int encontrar;
		boolean existe = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		encontrar = leia.nextInt();
		
		for(int i = 0; i<10; i++) {
			if(numeros[i] == encontrar) {
				System.out.println("O número "+ encontrar +" está localizado na posição: " + i);
				existe = true;
			}
		}
		if(existe == false) {
			System.out.println("O número "+ encontrar +" não foi encontrado!");
		}
		
		
	}

}
