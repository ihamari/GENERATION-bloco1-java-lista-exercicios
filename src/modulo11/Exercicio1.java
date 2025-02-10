package modulo11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int opcao =-1;
		String cliente, tipoCliente;
		
		Queue<String> fila = new LinkedList<String>();
		Queue<String> filaPreferencial = new LinkedList<String>();
		
		System.out.println("***********************************************************\n");
		System.out.println("	1 - Adicionar um novo Cliente na fila");
		System.out.println("	2 - Listar todos os Clientes");
		System.out.println("	3 - Retirar Cliente da fila");
		System.out.println("	0 - Sair");
		System.out.println("\n***********************************************************");
		

		while(opcao!=0) {
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch(opcao) {
				case 1: // Pergunta pro usuário se o cliente entra na fila preferencial ou na fila normal
					System.out.println("Digite o tipo de cliente:"
							+ "\nN - Atendimento normal"
							+ "\nP - Atendimento Preferencial");
					tipoCliente = leia.nextLine();
					switch(tipoCliente.toUpperCase()) {
						case "N":
							System.out.print("Nome do Cliente: ");
							cliente = leia.nextLine();
							fila.add(cliente);
							System.out.print("\nCliente " + cliente +" adicionado(a) a fila normal");
							
							break;
				
						case "P":
							System.out.print("Nome do Cliente: ");
							cliente = leia.nextLine();
							filaPreferencial.add(cliente);
							System.out.print("\nCliente " + cliente +" adicionado(a) a fila preferencial");
							
							break;
						default:
							System.out.println("\nTipo de Cliente inválido!!");
							
					}
					
					break;
				case 2: // se uma das filas estiver vazia printa o aviso que a fila está vazia caso ao contrário ele traz a fila
					if(fila.isEmpty()) {
						System.out.println("\nA Fila normal está vazia!");
					}
					else if(!fila.isEmpty()) {
						Iterator<String> iFila = fila.iterator();
						System.out.println("Fila Normal:");
						while(iFila.hasNext()) {
							System.out.println(iFila.next());
						}
					}
					if(filaPreferencial.isEmpty()) {
						System.out.println("\nA Fila Preferencial está vazia!");
					}
					else if(!filaPreferencial.isEmpty()) {
						Iterator<String> iFilaPreferencial = filaPreferencial.iterator();
						System.out.println("Fila Preferencial:");
						while(iFilaPreferencial.hasNext()) {
							System.out.println(iFilaPreferencial.next());
						}
					}
					break;
					
				case 3: // ele atende toda fila preferencial primeiro e depois atende a fila normal
					
					if(fila.isEmpty()&filaPreferencial.isEmpty()) {
						System.out.println("\nAs Filas estão vazias!");
					}
					else if(!filaPreferencial.isEmpty()) {
						System.out.print("\nCliente "+ filaPreferencial.poll() + " retirado(a) da fila preferencial");
					}
					else if(!fila.isEmpty()) {
						System.out.print("\nCliente "+ fila.poll() + " retirado(a) da fila");
					}
					break;
					
				case 0:
					System.out.println("\nPrograma Finalizado");
					break;
				default:
					System.out.println("\nOpção inválida!!");
					
			}
		}
		
		leia.close();
		
	}

}
