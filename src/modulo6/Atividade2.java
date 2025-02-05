package modulo6;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, nota4;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Média final: %.1f", media);
		

	}

}
