package modulo11;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao =-1;
		String livro;
		
		System.out.println("***********************************************************\n");
		System.out.println("	1 - Adicionar livro na pilha");
		System.out.println("	2 - Listar todos os livros");
		System.out.println("	3 - Retirar livro da pilha");
		System.out.println("	0 - Sair");
		System.out.println("\n***********************************************************");
		
		
		while(opcao!=0) {
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			switch(opcao) {
				case 1:
					System.out.print("Nome do Livro: ");
					leia.nextLine();
					livro = leia.nextLine();
					pilha.push(livro);
					System.out.print("\nLivro " + livro +" adicionado ao topo da pilha");
		
					break;
				case 2:
					if(pilha.isEmpty()) {
						System.out.println("\nA pilha está vazia!");
					}
					else {
						for(String item: pilha) {
							System.out.println(item);
						}
					}
					break;
				case 3:
					if(pilha.isEmpty()) {
						System.out.println("\nA pilha está vazia!");
					}
					else {
						System.out.print("\nLivro "+ pilha.pop() + " retirado(a) da pilha");
					}
					break;
					
				case 0:
					System.out.println("\nPrograma Finalizado");
					break;
				default:
					System.out.println("\nOpção inválida!!");	
			}
		
		}

	}

}
