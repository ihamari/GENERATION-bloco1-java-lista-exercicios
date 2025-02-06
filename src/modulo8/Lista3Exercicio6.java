package modulo8;

import java.util.Scanner;

public class Lista3Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, qtd = 0;
		double media = 0, somaMultiplos3 = 0;;
		
		
		Scanner leia = new Scanner(System.in);
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero%3 == 0 & numero != 0 ) {
				qtd++;
				somaMultiplos3+= numero;
			}
		}while(numero!=0);
		
		media = somaMultiplos3/qtd;
		
		System.out.print("A média de todos os números múltiplos de 3 é: " + media);

	}

}
