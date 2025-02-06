package modulo9;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
		
		Scanner leia = new Scanner(System.in);
		double notas[][] = new double[10][4];
		double mediasAlunos [] = new double[10];
		double media, soma = 0;
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("---------- Aluno " + (i+1) + " ----------");
			for(int j = 0; j<4; j++) {
				System.out.print("Aluno "+ (i+1) +" -- Nota "+ (j+1) + " : " );
				notas[i][j] = leia.nextDouble();
				soma += notas[i][j];
			}
			
			mediasAlunos [i] = soma/4;
			soma = 0;
		}
		
		for(int i = 0; i<10; i++) {
			System.out.printf("\nMédia aluno " + (i+1) + " : %.1f",mediasAlunos[i]);
		}
		
		
		
	}

}
