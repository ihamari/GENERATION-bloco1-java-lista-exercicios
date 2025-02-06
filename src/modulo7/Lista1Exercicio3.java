package modulo7;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com
		 * idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
		 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador
		 * (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De
		 * acordo com as Regras para a doação, mostre na tela se o doador está Apto ou
		 * Não Apto para doar sangue. Veja os exemplos abaixo:
		 */
		
		String nome, apto;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade>=18 && idade <69){ // verifica se tem entre 18 a 69 anos
			if(idade>=60 && primeiraDoacao) { // verifica se tem mais de 60 anos e se é a primeira doação
				apto = "não";
			}
			else {
				apto = "";
			}
		}
		else {
			apto = "não";
		}
		
		System.out.println(nome + " " + apto + " está apto(a) para doar sangue!");
		

	}

}
