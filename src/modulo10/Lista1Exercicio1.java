package modulo10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String input = "";
		
		System.out.println("Digite as cores que deseja guardar e digite 'sair'");
		
		while(!input.trim().equalsIgnoreCase("Sair")) {
			System.out.print("Digite uma cor: ");
			input = leia.nextLine();
			if(!input.trim().equalsIgnoreCase("Sair")) {
				cores.add(input);
			}
		}
		
		System.out.println("\nLista de todas as cores:");
		for(String cor: cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\nLista de todas as cores em ordem alfabética:");
		for(String cor: cores) {
			System.out.println(cor);
		}
	}

}
