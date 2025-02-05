package modulo6;

import java.util.Scanner;

public class Atividade2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidadeNotas;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade total de notas: ");
		quantidadeNotas = leia.nextInt();
		
		
		float soma, media, nota;
		soma = 0;
		for (int i = 1; i <= quantidadeNotas; i++) {
			System.out.print("Nota " + i +" : ");
			nota = leia.nextFloat();
			
			soma = soma + nota;
		}
		
		media = soma/quantidadeNotas;
		System.out.printf("Média final: %.1f", media);

	}

}
