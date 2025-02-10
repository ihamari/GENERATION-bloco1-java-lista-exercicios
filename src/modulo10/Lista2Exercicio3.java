package modulo10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer numero = 0;
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print("Digite um valor: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Listar dados do Set: ");
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		

	}

}
